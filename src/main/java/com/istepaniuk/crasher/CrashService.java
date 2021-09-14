package com.istepaniuk.crasher;

import java.util.ArrayList;
import java.util.Arrays;

public class CrashService {
    private Integer counter = 20;

    public ArrayList<Todo> getAllTodos() {
        var todos = new ArrayList<>(Arrays.asList(
                new Todo("this_backend_will", "crash miserably"),
                new Todo("requests_left", counter.toString())
        ));

        counter--;
        if (counter <= 0) {
            throw new RuntimeException("It finally crashed");
        }

        return todos;
    }
}
