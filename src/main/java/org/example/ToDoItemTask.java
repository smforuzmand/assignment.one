package org.example;

public class ToDoItemTask {
    private int id;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person assignee;

    public ToDoItemTask(int id, ToDoItem toDoItem, Person assignee) {

        this.id = id;
        this.toDoItem = toDoItem;
        this.assignee = assignee;
        if (this.assignee != null) {
            assigned=true;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        if (assignee!=null){
            return true;
        }
        return false;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public ToDoItem getToDoItem() {
        return toDoItem;
    }

    public void setToDoItem(ToDoItem toDoItem) {
        this.toDoItem = toDoItem;
    }

    public Person getPerson() {
        return assignee;
    }

    public void setPerson(Person person) {
        this.assignee = person;
    }
}
