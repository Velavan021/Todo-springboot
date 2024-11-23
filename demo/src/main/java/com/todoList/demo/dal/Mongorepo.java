package com.todoList.demo.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.todoList.demo.model.TodoModel;
@Repository
public interface Mongorepo extends MongoRepository<TodoModel,String>{
    
}
