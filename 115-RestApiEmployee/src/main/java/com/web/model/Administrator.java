package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Administrator {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String clients;
private String projects;
private String tasks;
public Administrator() {
	super();
}
public Administrator(int id, String clients, String projects, String tasks) {
	super();
	this.id = id;
	this.clients = clients;
	this.projects = projects;
	this.tasks = tasks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getClients() {
	return clients;
}
public void setClients(String clients) {
	this.clients = clients;
}
public String getProjects() {
	return projects;
}
public void setProjects(String projects) {
	this.projects = projects;
}
public String getTasks() {
	return tasks;
}
public void setTasks(String tasks) {
	this.tasks = tasks;
}
@Override
public String toString() {
	return "Administrator [id=" + id + ", clients=" + clients + ", projects=" + projects + ", tasks=" + tasks + "]";
}

}
