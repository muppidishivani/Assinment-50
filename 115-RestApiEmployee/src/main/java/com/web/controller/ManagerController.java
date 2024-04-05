package com.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Manager;
import com.web.service.ManagerServiceImp;


@RestController
@CrossOrigin("*")
public class ManagerController {
	@Autowired
	private ManagerServiceImp service;
@PostMapping("/save")
public Manager  saveData(@RequestBody Manager manager)
{
	Manager m=service.postData(manager);
	return m;
}
@GetMapping("/get")
public List<Manager> getData()
{
	List<Manager> time=service.getAll();
	return time;
	
}
@DeleteMapping("/delete/{id}")
public  void deleteData(@PathVariable int id)
{
	service.deleteRecord(id);
	
}
@PutMapping("/update/{id}")
public Manager updateData(@RequestBody Manager manager,@PathVariable int id)

{
	Manager g=service.updateManager(manager, id);
	return g;
}
}
