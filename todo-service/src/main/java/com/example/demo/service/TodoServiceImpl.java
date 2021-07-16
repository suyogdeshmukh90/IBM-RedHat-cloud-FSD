package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoDao;
import com.example.demo.model.Todo;
@Service
public class TodoServiceImpl implements TodoService{

	private TodoDao todoDao;
	@Autowired
	public TodoServiceImpl(TodoDao todoDao) {
		this.todoDao = todoDao;
	}

	@Override
	public Todo createTodo(Todo todo) {
		
		return todoDao.save(todo);
	}

	@Override
	public List<Todo> getAllTodos() {
		List<Todo> list=todoDao.findAll();
		return list;
	}

}
