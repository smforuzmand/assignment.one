package org.example;


import org.example.dao.implementations.AppUserDAOCollection;
import org.example.dao.implementations.PersonDAOCollection;
import org.example.dao.implementations.TodoItemDAOCollection;
import org.example.dao.implementations.TodoItemTaskDAOCollection;
import org.example.model.*;

import java.time.LocalDate;

public class MainApplication {
    public static void main(String[] args) {
        //Instantiating Person class
        Person person1 = new Person(1, "Ahmad", "Brayan", "NiliB@gmail.com");
        Person person2 = new Person(2, "John", "MacConhey", "Jm@email.com");
        //Creating some Items to do
        ToDoItem item1 = new ToDoItem(1, "GitHub Master", "Git and GitHub Course",
                LocalDate.parse("2022-08-07"), false, person1);
        ToDoItem item2 = new ToDoItem(2,"TDD","Debug and tests Study",
                LocalDate.parse("2022-08-15"),false,person2);
        //Creating some task of items to do
        ToDoItemTask itemTask1 = new ToDoItemTask(1, item1, person1);
        ToDoItemTask itemTask2 = new ToDoItemTask(2, item2, person2);

        AppUser appUser1 = new AppUser("alfa", "1234abcd", AppRole.ROLE_APP_USER);
        AppUser appUser2 = new AppUser("meta","1a2b3c4d",AppRole.ROLE_APP_ADMIN);
        /*
        audc1.persist(appUser1);
        audc1.persist(appUser2);
        appUser1.getPassword();
        System.out.println(audc1.findByUserName("meta"));
        audc1.remove(null);
        System.out.println("lets try a remove for a string : ");
        System.out.println("audc1 = " + audc1);
        //System.out.println(audc1.findAll());
        PersonDAOCollection pdc1 = new PersonDAOCollection();
        pdc1.persist(person1);
        pdc1.persist(person2);
        System.out.println(pdc1.findAll());
        System.out.println(pdc1.findById(2));
        System.out.println("the result of find by email is :"+ pdc1.findByEmail("NiliB@gmail.com"));
        System.out.println(pdc1.remove(2));
        System.out.println(pdc1.findAll());
        TodoItemDAOCollection tdidc = new TodoItemDAOCollection();
        tdidc.persist(item1);
        tdidc.persist(item2);
//        System.out.println(tdidc.findAllByDoneStatus(false));
        System.out.println(tdidc.findByDeadLineBefore(LocalDate.now()));
        System.out.println(tdidc.findAllByDoneStatus(true));
       /* String nullValue=null;
        //person1.setFirstName(nullValue);
        System.out.println(person1.toString());
        ToDoItemTask toDoItemTask1=new ToDoItemTask(1,null,person1);
        System.out.println(toDoItemTask1.isAssigned());
        Person personNull=null;
        toDoItemTask1.setPerson(personNull);
        System.out.println(toDoItemTask1.isAssigned());
        ToDoItem item = new ToDoItem(12,"study","Svenska",
                LocalDate.now(),true,person1);
        System.out.println(item);
    }*/

///////AppUserDAoCollection run///////////////////////////////////////////////////////////////////
        AppUserDAOCollection temp ;
        temp = AppUserDAOCollection.getInstance();

        temp.persist(appUser1);
        temp.persist(appUser2);
        System.out.println(temp.findByUserName("alfa"));

        System.out.println(temp.findAll());
       temp.remove("alfa");
        System.out.println(temp.findAll());
//////////PersonDAOCollection run/////////////////////////////////////////////////////////////////

        PersonDAOCollection per ;
        per = PersonDAOCollection.getInstance();
        per.persist(person1);
        per.persist(person2);
        System.out.println(per.findAll());

//////////TodoItemDAOCollection run///////////////////////////////////////////////////////////////
        TodoItemDAOCollection todo ;
        todo = TodoItemDAOCollection.getInstance();
        todo.persist(item1);
        todo.persist(item2);
        System.out.println("find to do item by id"+ todo.findById(1));

//////////TodoItemTskDAOCollection///////////////////////////////////////////////////////////////
        TodoItemTaskDAOCollection doTask;
        doTask = TodoItemTaskDAOCollection.getInstance();
        doTask.persist(itemTask1);
        doTask.persist(itemTask2);
        System.out.println(doTask.findByAssignedStatus(false));
        doTask.findById(person1.getId());







    }
}