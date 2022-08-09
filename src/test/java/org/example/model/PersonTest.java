
package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    public Person setPersontest;

    @BeforeEach
    public void testSetUp() {

        setPersontest = new Person(10, "erik", "sson", "sson@email.com");

    }

    @Test
    void setFirstName_Null_Throw_IllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                setPersontest.setFirstName(null);

            }
        });

    }


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

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> person.setLastName(nullLastName));
        assertEquals("not allowed to be null", exception.getMessage());
        assertNull(null, nullLastName);

    }

    @DisplayName("test null email throw exception")
    @Test
    void setEmail_null_ThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Person person = new Person(10, "erik", "sson", null);

            }
        });


    }


    @Test
    public void hastTest_run_Successful() {
        Person person = new Person(10, "erik", "sson", "sson@email.com");
        Person expectedResult = new Person(10, "erik", "sson", "sson@email.com");

        assertEquals(person.hashCode(), expectedResult.hashCode());

    }


}