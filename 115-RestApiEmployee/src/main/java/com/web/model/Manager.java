package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String projectName;
	private String tasks;
	private String approval;
	private int hours;
	public Manager() {
		super();
	}
	public Manager(int id, String projectName, String tasks, String approval, int hours) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.tasks = tasks;
		this.approval = approval;
		this.hours = hours;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", projectName=" + projectName + ", tasks=" + tasks + ", approval=" + approval
				+ ", hours=" + hours + "]";
	}
	
}
