package org.example.dao.implementations;

import org.example.dao.TodoItemTaskDAO;
import org.example.dao.sequencer.TodoItemTaskIdSequencer;
import org.example.model.ToDoItemTask;

import java.util.ArrayList;
import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {

    //creating the only object of the class
    private static TodoItemTaskDAOCollection instance;
    private List<ToDoItemTask> toDoItemTasks;

    // altering the constructor to the private avoiding further instantiating
    private TodoItemTaskDAOCollection() {
        toDoItemTasks = new ArrayList<>();
    }


    //the static method to return the only instance, the global access point for outer world to get the instance
    public static TodoItemTaskDAOCollection getInstance() {
        if (instance == null) {
            instance= new TodoItemTaskDAOCollection();
        }
        return instance;
    }

    @Override
    public ToDoItemTask persist(ToDoItemTask todoItemTask) {
        if (todoItemTask == null) {
            throw new IllegalArgumentException("Null not allowed! ");
        }

        todoItemTask.setId(TodoItemTaskIdSequencer.nextId());
        toDoItemTasks.add(todoItemTask);

        return todoItemTask;
    }

    @Override
    public ToDoItemTask findById(int id) {
        for (ToDoItemTask itemTask : toDoItemTasks) {
            if ((itemTask.getId() == id) && (id != 0)) return itemTask;

        }

        return null;
    }

    @Override
    public List<ToDoItemTask> findAll() {
        return toDoItemTasks;
    }

    @Override
    //findByAssignedStatus: return all TodoItemTask.class objects where assigned matches status

    public List<ToDoItemTask> findByAssignedStatus(boolean status) {
        for (ToDoItemTask itemTask : toDoItemTasks) {
            if (itemTask.isAssigned() == status) return toDoItemTasks;

        }
        return null;
    }


    @Override
    //findByPersonId: return all TodoItemTask.class objects where todoItemTask.assignee.id matches personId

    public List<ToDoItemTask> findByPersonId(int personId) {
        for (ToDoItemTask itemTask : toDoItemTasks) {
            if (itemTask.getPerson().getId() == personId) return toDoItemTasks;
        }

        return null;
    }

    @Override
    //remove: removes one TodoItemTask.class object from collection
    public void remove(int id) {
        ToDoItemTask task = findById(id);
        if (task != null) toDoItemTasks.remove(task);


    }
}
