package com.example.iService;

import java.util.List;

import com.example.entity.Result;

public interface GenericDAO<T> {
	
	public Result add(T t);
	public Result remove(T t);
	public Result update(T t);
	public T find(Long id);
	public List<T> find(String name);
}
