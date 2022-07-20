package com.spring.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "todo", consumes = APPLICATION_JSON_VALUE)
public class TodoListController {

    @Autowired
    private TodoEntityRepository todoEntityRepository;

    @GetMapping
    public List<TodoEntity> getTasks() {

        return todoEntityRepository.findAll();
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public TodoEntity postTask(@RequestBody TodoEntity todoEntity) {

        return todoEntityRepository.save(todoEntity);
    }
}
