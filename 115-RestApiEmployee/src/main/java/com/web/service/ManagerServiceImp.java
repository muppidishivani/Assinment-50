package com.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Manager;
import com.web.repositpry.ManagerRepo;

@Service
public class ManagerServiceImp implements ManagerService {
@Autowired
private ManagerRepo repo;
	@Override
	public Manager postData(Manager manager) {
	
		return repo.save(manager);
	}
	@Override
	public List<Manager> getAll() {
		List<Manager> n=repo.findAll();
		return n;
	}
	@Override
	public void deleteRecord(int id) {
		// TODO Auto-generated method stub
	 repo.deleteById(id);
		
	}
	@Override
	public Manager updateManager(Manager manager,int id) {
		Manager m=repo.findById(id).get();
		m.setTasks(manager.getTasks());
		m.setApproval(manager.getApproval());
		m.setHours(manager.getHours());
		return repo.save(m);
	}

}
