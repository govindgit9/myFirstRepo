package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
import com.example.demo.repository.HomeRepo;

@Service
public class HomeServiceImpl implements HomeServices{
	
	
	@Autowired
	HomeRepo hr;
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveData(Courses cs) {
		// TODO Auto-generated method stub
		hr.save(cs);
	}

	@Override
	public Iterable<Courses> getAllData() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
	}

	
	
	
}
