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
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Administrator;
import com.web.service.AdministratorServiceImp;

@RestController
@CrossOrigin("*")
public class AdministratorController {
@Autowired
private AdministratorServiceImp service;
@PostMapping("/savedata")
public Administrator postData(@RequestBody Administrator admin) 
{
	Administrator a=service.saveData(admin);
	return a;
	
}
@GetMapping("/getAll")
public List<Administrator> getData() 
{
	List<Administrator> a=service.getData();
	return a;
	
}
@DeleteMapping("/deletedata/{id}")
public void gData(@PathVariable int id) 
{
	service.deleteOne(id);
	
}
@PutMapping("/updatedata/{id}")
public Administrator admin(@RequestBody Administrator admin,@PathVariable int id)
{
	Administrator d=service.updateData(admin, id);
	return d;
}

}
