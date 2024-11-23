package com.todoList.demo.dal;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.todoList.demo.model.TodoModel;
@Repository
public interface Todorepo {
    public List<TodoModel> read();
    public TodoModel create(TodoModel todoModel);
    public TodoModel update(TodoModel todoModel,String id);
    public String delete(String id);    
}
