package org.example.dao.implementations;

import org.example.dao.PersonDAO;
import org.example.dao.sequencer.PersonIdSequencer;
import org.example.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {

//create the only object of the class
private static PersonDAOCollection instance;
    private List<Person> personList;

    // change the access modifier to privately avoiding the further instantiating
    private PersonDAOCollection() {
        personList=new ArrayList<>();
    }

// providing the public static method to return the only object and access from outer world
    public static PersonDAOCollection getInstance() {
        if (instance==null){
            instance = new PersonDAOCollection();
        }


        return instance;

    }

    @Override
    //persist: add new Person.class object to collection
    public Person persist(Person person) {
        if (person == null) throw new RuntimeException("null object is not allowed");
        person.setId(PersonIdSequencer.nextId());
        personList.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person p : personList) {
            if ((p.getId() == id) && (id != 0)) {
                return p;
            } else {
                throw new IllegalArgumentException("inserted id is not valid");

            }

        }

         return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person p : personList) {
            if (p.getEmail().equals(email)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public boolean remove(int id) {
        for (Person p : personList) {
            if (p.getId() != 0)
                personList.remove(p);
        }

        return false;
    }
}
