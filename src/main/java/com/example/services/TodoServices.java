package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.models.Todo;

@Service
public class TodoServices {
	
	private List<Todo> toDos = new ArrayList<>();
	
	public Todo creatTodo(Todo t)
	{
		toDos.add(t);
		return t;
	}
	
	public List<Todo> getTodo()
	{
		return toDos;
	}
}
