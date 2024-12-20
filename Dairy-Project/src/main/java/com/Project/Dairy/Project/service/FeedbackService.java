package com.Project.Dairy.Project.service;

import java.util.List;

import com.Project.Dairy.Project.model.Feedback;



public interface FeedbackService {
 
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(int i,Feedback r);
}
