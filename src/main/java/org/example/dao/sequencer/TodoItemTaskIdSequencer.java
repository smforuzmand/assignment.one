package org.example.dao.sequencer;

public class TodoItemTaskIdSequencer {

    private static int currentId=1;


    public static int nextId(){
        return ++currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        TodoItemTaskIdSequencer.currentId = currentId;
    }
}
