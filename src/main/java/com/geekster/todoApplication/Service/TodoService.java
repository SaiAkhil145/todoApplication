package com.geekster.todoApplication.Service;

import com.geekster.todoApplication.Model.Todo;
import com.geekster.todoApplication.Repo.ITodoRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    ITodoRepo todoRepo;

    public String addTodo(Todo todo) {
        todoRepo.save(todo);
        return "todo added";
    }

    public List<Todo> getTodos() {
        return (List<Todo>) todoRepo.findAll();
    }

    public String updateTodoById(Integer newId,boolean status) {
        Todo newTodo = todoRepo.findById(newId).orElse(null);
        if(newTodo!=null){
            newTodo.setTodoStatus(status);
            todoRepo.save(newTodo);
            return "updated";
        }
        return "no id found";
    }

    public String deleteTodo(Integer id) {
        todoRepo.deleteById(id);
        return "deleted";
    }

    public String addTodos(List<Todo> todos) {
        todoRepo.saveAll(todos);
        return todos.size()+" todos saved";
    }

    public Todo getTodoById(Integer id) {
        return todoRepo.findById(id).get();
    }
}
