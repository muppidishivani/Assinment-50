package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Staff;
import com.web.service.StaffServiceImp;

@RestController
@CrossOrigin("*")
public class StaffController {
@Autowired
private StaffServiceImp service;
@PostMapping("/saverecord")
public Staff saveData(@RequestBody Staff staff)
{
	Staff s=service.addData(staff);
			return s;
}
}
