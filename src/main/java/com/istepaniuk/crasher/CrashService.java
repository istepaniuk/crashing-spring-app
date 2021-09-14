package com.istepaniuk.crasher;

import java.util.ArrayList;
import java.util.Arrays;

public class CrashService {
    private Integer counter = 20;

    public ArrayList<Todo> getAllTodos() {
        counter--;
        if (counter <= 0) {
            throw new RuntimeException("It finally crashed");
        }

        return new ArrayList<>(Arrays.asList(
                new Todo("this_backend_will", "crash miserably"),
                new Todo("requests_left", counter.toString())
        ));
    }
}
