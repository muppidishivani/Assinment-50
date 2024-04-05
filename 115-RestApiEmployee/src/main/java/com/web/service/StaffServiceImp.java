package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Staff;
import com.web.repositpry.StaffRepo;
@Service
public class StaffServiceImp implements StaffService {
@Autowired
private StaffRepo repo;
	@Override
	public Staff addData(Staff staff) {
		// TODO Auto-generated method stub
		return repo.save(staff);
	}

}
