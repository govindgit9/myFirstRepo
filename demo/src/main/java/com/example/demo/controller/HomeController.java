package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.HomeServices;

@RestController
public class HomeController {
	
	@Autowired
	HomeServices hs;

	@GetMapping("/home")
	public String home()
	{
		return "This is home page";
	}
	
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		List<Courses> clist=new ArrayList<>();
		clist.add(new Courses(1,"python","fees:2000"));
		clist.add(new Courses(2,"Java","fees:3000"));
		
		return clist;
	}
	
	@PostMapping("/saveData")
	public void saveData(@RequestBody Courses cs)
	{
	     hs.saveData(cs);
		
	}
	
	@GetMapping("/getData")
	public List<Courses> getData()
	{
		List<Courses> list=(List<Courses>) hs.getAllData();
		for(Courses cs:list)
		{
			System.out.println(cs);
		}
		
		return list;
		
	}
	
	@RequestMapping(value = "/deleteData/{id}" , method = RequestMethod.DELETE )
	public void deleteData(@PathVariable("id") int id)
	{
		hs.deleteData(id);
	}
	
	
}
