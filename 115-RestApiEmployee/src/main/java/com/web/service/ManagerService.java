package com.web.service;

import java.util.List;

import com.web.model.Manager;

public interface ManagerService {
public Manager postData(Manager manager);
public List<Manager> getAll();
public void deleteRecord(int id);
public Manager updateManager(Manager manager,int id);
}
