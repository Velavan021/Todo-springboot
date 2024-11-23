package com.todoList.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoList.demo.dal.Todorepo;
import com.todoList.demo.model.TodoModel;
@Service
public class Todoservice {
    @Autowired
    Todorepo trepo;
    
    public List<TodoModel> readService(){
        return trepo.read();
    }
    public TodoModel createService(TodoModel todoModel){
        return trepo.create(todoModel);
    }
    public TodoModel updateService(TodoModel todoModel,String id){
        return trepo.update(todoModel, id);
    }
    public String deleteService(String id){
        return trepo.delete(id);
    }


}
