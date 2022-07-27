package org.example.dao.implementations;

import org.example.dao.TodoItemTaskDAO;
import org.example.dao.sequencer.TodoItemTaskIdSequencer;
import org.example.model.ToDoItemTask;

import java.util.ArrayList;
import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {


    List<ToDoItemTask> toDoItemTasks;

    public TodoItemTaskDAOCollection() {
        toDoItemTasks = new ArrayList<>();
    }

    public TodoItemTaskDAOCollection(List<ToDoItemTask> toDoItemTasks) {
        this.toDoItemTasks = toDoItemTasks;
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
            if ((itemTask.getId() == id) && (id != 0))
                return itemTask;

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
            if (itemTask.isAssigned()==status)
                return toDoItemTasks;

        }
        return null;
    }


    @Override
    //findByPersonId: return all TodoItemTask.class objects where todoItemTask.assignee.id matches personId

    public List<ToDoItemTask> findByPersonId(int personId) {
        for (ToDoItemTask itemTask : toDoItemTasks) {
            if (itemTask.getPerson().getId()==personId)
                return toDoItemTasks;
        }

        return null;
    }

    @Override
    //remove: removes one TodoItemTask.class object from collection
    public void remove(int id) {
        ToDoItemTask task = findById(id);
        if (task!= null) toDoItemTasks.remove(task);

    }
}
