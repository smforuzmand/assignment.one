package org.example.dao;

import org.example.model.ToDoItemTask;

import java.util.List;

public interface TodoItemTaskDAO {
    ToDoItemTask persist(String todoItemTask);

    ToDoItemTask findById(int id);

    List<ToDoItemTask> findAll();

    List<ToDoItemTask> findByAssignedStatus(boolean status);

    List<ToDoItemTask> findByPersonId(int personId);

    void remove(int id);
}
