package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Todo;

public interface TodoService {
	public Todo createTodo(Todo todo);
	public List<Todo> getAllTodos();
}
