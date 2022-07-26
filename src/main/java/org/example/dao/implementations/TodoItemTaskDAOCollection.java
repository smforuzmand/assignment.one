package org.example.dao.implementations;

import org.example.dao.TodoItemTaskDAO;
import org.example.model.ToDoItemTask;

import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {
    @Override
    public ToDoItemTask persist(String todoItemTask) {
        return null;
    }

    @Override
    public ToDoItemTask findById(int id) {
        return null;
    }

    @Override
    public List<ToDoItemTask> findAll() {
        return null;
    }

    @Override
    public List<ToDoItemTask> findByAssignedStatus(boolean status) {
        return null;
    }

    @Override
    public List<ToDoItemTask> findByPersonId(int personId) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
