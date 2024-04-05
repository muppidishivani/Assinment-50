package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.SignUp;
import com.web.service.SignUpServiceImp;

@RestController
@CrossOrigin("*")
public class SignUpController {
	@Autowired
	private SignUpServiceImp service;
	
	@PostMapping("/signup")
public SignUp postData(@RequestBody SignUp signup)
{
	SignUp s=service.saveData(signup);
	return s;
}
	@GetMapping("/getdata")
	public List<SignUp> getRecord()
	{
		List<SignUp> d=service.getData();
		return d;
	}
	
	
	
	
}
