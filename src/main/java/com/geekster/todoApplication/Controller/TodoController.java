package com.geekster.todoApplication.Controller;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.geekster.todoApplication.Model.Todo;
import com.geekster.todoApplication.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping("Todo")
    public String addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @GetMapping("get/todos")
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }
    @PutMapping("update/Todo/{newId}/{status}/status")
    public String updateTodoById(@PathVariable Integer newId,@PathVariable boolean status){
        return todoService.updateTodoById(newId,status);
    }

    @DeleteMapping("todo/{id}/id")
    public String deleteTodo(@PathVariable Integer id){
        return todoService.deleteTodo(id);
    }
    @PostMapping("addTodos")
    public String addTodos(@RequestBody List<Todo> todos){
        return todoService.addTodos(todos);
    }
    @GetMapping("todo/{id}/id")
    public Todo getTodoById(@PathVariable Integer id){
        return todoService.getTodoById(id);
    }
}
