package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class ToDoItem {
    private int id;
    private String title;
    public String description;
    private LocalDate deadLine;
    boolean done;
    private Person creator;

    public ToDoItem(int id, String title, String description,
                    LocalDate deadLine, boolean done, Person creator) {
        if (title==null || title.trim().equals("")){
            throw new IllegalArgumentException("title not allowed");
        }
        if (deadLine==null ){
            throw new IllegalArgumentException("deadLine not allowed");
        }
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title==null || title.trim().equals("")){
            throw new IllegalArgumentException("title not allowed");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine==null ){
            throw new IllegalArgumentException("deadLine not allowed");
        }
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public boolean isOverDue(){
        return deadLine.isBefore(LocalDate.now());
    }
    /*public String getSummary() {
        return " the object summary is " +this.toString();
    }*/


    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItem item = (ToDoItem) o;
        return id == item.id && done == item.done && Objects.equals(title, item.title) && Objects.equals(description, item.description) && Objects.equals(deadLine, item.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, deadLine, done);
    }
}
