package com.WebProject.Enitiy;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
    private int ID;
	private String status;
	private String name;
	public User(int iD, String status, String name) {
		super();
		ID = iD;
		this.status = status;
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", status=" + status + ", name=" + name + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
