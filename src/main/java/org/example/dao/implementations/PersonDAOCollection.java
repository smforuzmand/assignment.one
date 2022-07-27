package org.example.dao.implementations;

import org.example.dao.PersonDAO;
import org.example.dao.sequencer.PersonIdSequencer;
import org.example.model.AppUser;
import org.example.model.Person;

import java.util.List;

public class PersonDAOCollection implements PersonDAO {

    private List<Person> personList;

    public PersonDAOCollection(List<Person> personList) {
        this.personList = personList;
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
            if ((p.getId() == id) && (id != 0))
                return p;

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
    public void remove(int id) {
        for (Person p : personList) {
            if (p.getId() != 0) {

            }
        }

    }
}
