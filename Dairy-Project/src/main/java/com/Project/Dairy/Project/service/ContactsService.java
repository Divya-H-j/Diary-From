package com.Project.Dairy.Project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Project.Dairy.Project.model.Contacts;

public interface ContactsService {
	Contacts insertrecord(Contacts r);
	List<Contacts> getAll();
	void del(int ri);
	Contacts updaterecord(int i,Contacts r);
}
