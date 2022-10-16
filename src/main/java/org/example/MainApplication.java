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
        ToDoItem item2 = new ToDoItem(2, "TDD", "Debug and tests Study",
                LocalDate.parse("2022-08-15"), false, person2);
        //Creating some task of items to do
        ToDoItemTask itemTask1 = new ToDoItemTask(1, item1, person1);
        ToDoItemTask itemTask2 = new ToDoItemTask(2, item2, person2);

        AppUser appUser1 = new AppUser("alfa", "1234abcd", AppRole.ROLE_APP_USER);
        AppUser appUser2 = new AppUser("meta", "1a2b3c4d", AppRole.ROLE_APP_ADMIN);

///////AppUserDAoCollection run///////////////////////////////////////////////////////////////////
        AppUserDAOCollection temp = AppUserDAOCollection.getInstance();

        temp.persist(appUser1);
        temp.persist(appUser2);
        System.out.println(temp.findByUserName("alfa"));

        System.out.println(temp.findAll());
        temp.remove("alfa");
        System.out.println(temp.findAll());
//////////PersonDAOCollection run/////////////////////////////////////////////////////////////////

        PersonDAOCollection per;
        per = PersonDAOCollection.getInstance();
        per.persist(person1);
        per.persist(person2);
        System.out.println(per.findAll());

//////////TodoItemDAOCollection run///////////////////////////////////////////////////////////////
        TodoItemDAOCollection todo;
        todo = TodoItemDAOCollection.getInstance();
        todo.persist(item1);
        todo.persist(item2);
        System.out.println("find to do item by id" + todo.findById(1));

//////////TodoItemTskDAOCollection///////////////////////////////////////////////////////////////
        TodoItemTaskDAOCollection doTask;
        doTask = TodoItemTaskDAOCollection.getInstance();
        doTask.persist(itemTask1);
        doTask.persist(itemTask2);
        System.out.println(doTask.findByAssignedStatus(false));
        doTask.findById(person1.getId());


    }
}