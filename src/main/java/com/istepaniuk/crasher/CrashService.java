package com.istepaniuk.crasher;

import java.util.ArrayList;
import java.util.Arrays;

public class CrashService {
    private Integer counter = 20;

    public ArrayList<Todo> getAllTodos() {
        if (Math.random() < 0.1) {
            System.exit(666);
        }

        return new ArrayList<>(Arrays.asList(
                new Todo("this_backend_will", "crash miserably")
        ));
    }
}
