package org.example.dao;

import org.example.model.Person;

import java.util.List;

public interface PersonDAO {

    Person persist (Person person);
    Person findById (int id);
    Person findByEmail (String email);
    List<Person> findAll();

    void remove(int id);


}
