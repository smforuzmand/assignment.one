package org.example.model;

import java.util.Objects;

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
        return assignee != null;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItemTask that = (ToDoItemTask) o;
        return id == that.id && assigned == that.assigned && toDoItem.equals(that.toDoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, toDoItem);
    }

    @Override
    public String toString() {
        return "ToDoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", toDoItem=" + toDoItem +
                '}';
    }
}
