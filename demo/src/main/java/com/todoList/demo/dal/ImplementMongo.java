package com.todoList.demo.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todoList.demo.model.TodoModel;
@Repository
public class ImplementMongo implements Todorepo {
    @Autowired 
    Mongorepo mrepo;
    @Override
    public List<TodoModel> read(){
        return mrepo.findAll();
    }
    @Override
    public TodoModel create(TodoModel todoModel){
        return mrepo.save(todoModel);
    }
    @Override
    public TodoModel update(TodoModel todoModel,String id){
        TodoModel oldid= mrepo.findById(id).get();
        oldid.setTitle(todoModel.getTitle());
        oldid.setDescription(todoModel.getDescription());
        return mrepo.save(oldid);
    }
    @Override
    public String delete(String id){
        mrepo.deleteById(id);
        return "deleted sucessfully";
    }
}
