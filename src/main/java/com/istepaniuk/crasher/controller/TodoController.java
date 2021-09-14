package com.istepaniuk.crasher.controller;

import com.istepaniuk.crasher.Todo;
import com.istepaniuk.crasher.CrashService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoController {
    private final CrashService todoService;

    TodoController(CrashService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public ArrayList<Todo> getIndex() {
        return this.todoService.getAllTodos();
    }
}
