package com.istepaniuk.crasher;

public class Todo {
    private final String when;
    private final String task;

    public Todo(String when, String task) {
        this.when = when;
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public String getWhen() {
        return when;
    }
}
