package com.Project.Dairy.Project.service;

import java.util.List;

import com.Project.Dairy.Project.model.BuyNow;


public interface BuyNowService {
	BuyNow insertrecord(BuyNow r);
	List<BuyNow> getAll();
	void del(int ri);
	BuyNow updaterecord(int i,BuyNow r);
}
