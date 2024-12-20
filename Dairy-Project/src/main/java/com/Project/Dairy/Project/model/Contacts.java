package com.Project.Dairy.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Contacts {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int conid;

	private String name,emailid,phone,message;

	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacts(String name, String emailid, String phone, String message) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
		this.message = message;
	}

	public int getConid() {
		return conid;
	}

	public void setConid(int conid) {
		this.conid = conid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Contacts [conid=" + conid + ", name=" + name + ", emailid=" + emailid + ", phone=" + phone
				+ ", message=" + message + "]";
	}
	
}
