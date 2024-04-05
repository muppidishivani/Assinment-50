package com.web.service;

import java.util.List;

import com.web.model.Administrator;

public interface AdministratorService {
public Administrator saveData(Administrator admin);
public List<Administrator> getData();
public void deleteOne(int id);
public Administrator updateData(Administrator admin,int id);
}