package com.example.todo.service;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {
    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> getTodos() {
        return repository.findAll();
    }

    public Todo addTodo(Todo todo) {
        return repository.save(todo);
    }

    public void deleteTodo(UUID id) {
        repository.deleteById(id);
    }
}