package com.todoList.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.todoList.demo.model.TodoModel;
import com.todoList.demo.service.Todoservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/todo")
public class Todocontroller {
    @Autowired
    Todoservice tservice;
    @GetMapping("/todo")
    public List<TodoModel> readController() {
        return tservice.readService();
    }
    @PostMapping("/todo")
    public TodoModel createController(@RequestBody TodoModel tmodel){
        return tservice.createService(tmodel);
    }
    @PutMapping("/todo/{id}")
    public TodoModel updateController(@RequestBody TodoModel tmodel, @PathVariable String id){
        return tservice.updateService(tmodel, id);
    }
    @DeleteMapping("/todo/{id}")
    public String deleteController(@PathVariable String id){
        return tservice.deleteService(id);
    }

    
}
