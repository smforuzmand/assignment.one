package org.example.model;

import org.example.model.Person;
import org.example.model.ToDoItem;
import org.example.model.ToDoItemTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemTaskTest {

    private ToDoItemTask itemTaskTest;
    Person person1 = new Person(1, "Ahmad", "Brayan", "NiliB@gmail.com");
    Person person2 = new Person(2, "John", "MacConhey", "Jm@email.com");
    ToDoItem item1 = new ToDoItem(1, "GitHub Master", "Git and GitHub Course",
            LocalDate.parse("2022-08-07"), false, person1);
    ToDoItem item2 = new ToDoItem(2, "TDD", "Debug and tests Study",
            LocalDate.parse("2022-08-15"), false, person2);

    @BeforeEach
    public void setUp() {
        ToDoItemTask itemTaskTest = new ToDoItemTask();
    }

    @Test
    void setToDoItemTest() {
        ToDoItem item1 = new ToDoItem(1, "GitHub Master", "Git and GitHub Course",
                LocalDate.parse("2022-08-07"), false, person1);
        itemTaskTest.setToDoItem(item1);
        ToDoItemTask toDoItemTaskTest = new ToDoItemTask(1, item1, person1);
        Assertions.assertEquals(1, toDoItemTaskTest.getId());
        Assertions.assertEquals(item1, toDoItemTaskTest.getToDoItem());
        Assertions.assertEquals(person1, toDoItemTaskTest.getPerson());
        //Assertions.assertEquals(item1,itemTaskTest.getToDoItem());


    }

    @Test

    void TestIsAssigneeIsTrue(){
        ToDoItemTask doItemTask = new ToDoItemTask(2, item2, person2);

        Assertions.assertTrue(doItemTask.isAssigned());



    }

}