package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("/api")
public class TodoController {
	private TodoService todoService;

	@Autowired
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	@PostMapping("/todos")
	public ResponseEntity<Todo> createTodo(@RequestBody Todo todo)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(todoService.createTodo(todo));
	}
	@GetMapping("/todos")
	public ResponseEntity<List<Todo>> getAllTodos()
	{
		return ResponseEntity.status(HttpStatus.OK).body(todoService.getAllTodos());
	}
}
