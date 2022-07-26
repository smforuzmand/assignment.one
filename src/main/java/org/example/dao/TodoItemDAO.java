package org.example.dao;

import org.example.model.ToDoItem;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {
    ToDoItem persist(ToDoItem toDoItem);

    ToDoItem findById(int id);

    List<ToDoItem> findAll();

    List<ToDoItem> findAllByDoneStatus(boolean done);

    List<ToDoItem> finByTitleContains(String title);

    List<ToDoItem> findByPersonId(int personId);

    List<ToDoItem> findByDeadLineBefore(LocalDate date);

    List<ToDoItem> findByDeadLineAfter(LocalDate date);

    void remove(int id);

}
