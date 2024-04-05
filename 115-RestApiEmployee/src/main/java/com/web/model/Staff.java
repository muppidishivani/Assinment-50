package com.web.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String fullName;
private String projectName;
private String tasks;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date date;
private int hours;
public Staff() {
	super();
}
public Staff(int id, String fullName, String projectName, String tasks, Date date, int hours) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.projectName = projectName;
	this.tasks = tasks;
	this.date = date;
	this.hours = hours;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getTasks() {
	return tasks;
}
public void setTasks(String tasks) {
	this.tasks = tasks;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
@Override
public String toString() {
	return "Staff [id=" + id + ", fullName=" + fullName + ", projectName=" + projectName + ", tasks=" + tasks
			+ ", date=" + date + ", hours=" + hours + "]";
}


}
