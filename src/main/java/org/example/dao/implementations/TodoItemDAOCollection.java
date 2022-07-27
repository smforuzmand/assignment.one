package org.example.dao.implementations;

import org.example.dao.TodoItemDAO;
import org.example.dao.sequencer.TodoItemIdSequencer;
import org.example.model.Person;
import org.example.model.ToDoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDAOCollection implements TodoItemDAO {

    List<ToDoItem> toDoItems;

    public TodoItemDAOCollection() {
        toDoItems = new ArrayList<>();
    }

    @Override
    public ToDoItem persist(ToDoItem toDoItem) {
        if (toDoItem == null) throw new RuntimeException("Null in not allowed");
        toDoItem.setId(TodoItemIdSequencer.nextId());
        toDoItems.add(toDoItem);

        return toDoItem;
    }

    @Override
    public ToDoItem findById(int id) {
        for (ToDoItem item : toDoItems) {
            if ((item.getId() == id) && (id != 0))
                return item;

        }
        return null;
    }

    @Override
    public List<ToDoItem> findAll() {
        return toDoItems;
    }

    @Override
    //• findAllByDoneStatus: returns many TodoItem.class objects where status match
    public List<ToDoItem> findAllByDoneStatus(boolean done) {

        for (ToDoItem item : toDoItems) {
            if (item.isDone() == done)
                return toDoItems;
        }

        return null;
    }

    @Override
    //findByTitleContains: returns many TodoItem.class objects where title match.
    public List<ToDoItem> finByTitleContains(String title) {
        for (ToDoItem item : toDoItems) {
            if (item.getTitle().equalsIgnoreCase(title))
                return toDoItems;
        }
        return null;
    }

    @Override
    /*findByPersonId: returns many TodoItem.class objects where personId
    match todoItem.creator.id*/
    public List<ToDoItem> findByPersonId(int personId) {
        for (ToDoItem item : toDoItems) {
            if (item.getCreator().getId() == personId)
                return toDoItems;
        }
        return null;

    }

    @Override
    /*findByDeadlineBefore: returns many TodoItem.class objects where date is before deadline
     */
    public List<ToDoItem> findByDeadLineBefore(LocalDate date) {
        for (ToDoItem item : toDoItems) {
            if (item.getDeadLine().isBefore(date))
                return toDoItems;
        }
        return null;
    }

    @Override
    /*findByDeadlineAfter: returns many TodoItem.class objects where date is after deadline*/
    public List<ToDoItem> findByDeadLineAfter(LocalDate date) {

        for (ToDoItem item : toDoItems) {
            if (item.getDeadLine().isAfter(date))
                return toDoItems;
        }
        return null;
    }

    @Override
    //remove: remove one TodoItem.class object from collection
    public void remove(int id) {
        ToDoItem doItem = findById(id);
        if (doItem.getTitle() != null) {
            toDoItems.remove(doItem);
        }

    }
}
