package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("set last name when not null should set lastname successfully")
    void setLastName() {
        Person person = new Person(10, "erik", "sson", "sson@email.com");
        person.setLastName("foruzmand");
        assertEquals("foruzmand", person.getLastName());

    }

    @Test
    @DisplayName("set last name when null should throw exception")
    void setLastNameWhenNull() {
        Person person = new Person(10, "erik", "sson", "sson@email.com");
        String nullLastName = null;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> person.setLastName(nullLastName));
        assertEquals("not allowed to be null", exception.getMessage());



    }

}