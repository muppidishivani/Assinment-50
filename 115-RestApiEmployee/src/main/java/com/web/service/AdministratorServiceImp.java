package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Administrator;
import com.web.repositpry.AdministratorRepo;
@Service
public class AdministratorServiceImp implements AdministratorService {
@Autowired
private AdministratorRepo repo;
	@Override
	public Administrator saveData(Administrator admin) {
		
		return repo.save(admin);
	}
	@Override
	public List<Administrator> getData() {
		List<Administrator> m=(List<Administrator>) repo.findAll();
		return m;
	}
	@Override
	public void deleteOne(int id) {
		repo.deleteById(id);
		
	}
	@Override
	public Administrator updateData(Administrator admin,int id) {
		Administrator ad=repo.findById(id).get();
		ad.setClients(admin.getClients());
		ad.setProjects(admin.getProjects());
		ad.setTasks(admin.getTasks());
		
		return repo.save(ad);
	}
	
	
	
}
