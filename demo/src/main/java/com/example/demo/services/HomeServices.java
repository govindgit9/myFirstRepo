package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entities.*;

@Service
public interface HomeServices {

	public List<Courses> getCourses();
	//public Courses getCourse(long courseId);
	
	public void saveData(Courses cs);
	
	public Iterable<Courses> getAllData();
	public void deleteData(int id);
	
}
