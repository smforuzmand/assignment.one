package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemTest {
    @DisplayName("setTitle when null or empty should throw exception")
    @Test
    void setTitleTestWhenNull() {
        Person person1 = new Person(10, "erik", "sson", "sson@email.com");
        ToDoItem toDoItem = new ToDoItem(1, "playBoy", "Agility with Jira",
                LocalDate.of(2022, 9, 30), true, person1);

            String nullLastName = null;

            Exception exception = assertThrows(IllegalArgumentException.class,
                    () -> toDoItem.setTitle(nullLastName));
            assertEquals("not allowed to be null", exception.getMessage());


        }

    @Test
    void setDescription() {
    }

    @Test
    void isDone() {
    }

    @Test
    void isOverDue() {
    }
}