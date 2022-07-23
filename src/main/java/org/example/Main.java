package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person(12,"Ahmad","Brayan","NiliB@gmail.com");
        String nullValue=null;
        //person1.setFirstName(nullValue);
        System.out.println(person1.getSummary());


        ToDoItemTask toDoItemTask1=new ToDoItemTask(1,null,person1);
        System.out.println(toDoItemTask1.isAssigned());
        Person personNull=null;
        toDoItemTask1.setPerson(personNull);
        System.out.println(toDoItemTask1.isAssigned());
        ToDoItem item = new ToDoItem(12,"study","Svenska",
                LocalDate.MIN,true,person1);
        System.out.println(item);
    }
}