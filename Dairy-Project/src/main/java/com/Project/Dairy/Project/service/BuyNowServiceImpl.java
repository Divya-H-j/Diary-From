package com.Project.Dairy.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Project.Dairy.Project.model.BuyNow;
import com.Project.Dairy.Project.model.Contacts;
import com.Project.Dairy.Project.repository.BuyNowRepository;


@Service
public class BuyNowServiceImpl implements BuyNowService{

	@Autowired
	@Qualifier("BuyRepo")
	private BuyNowRepository BuyRepo;
	
	@Override
	public BuyNow insertrecord(BuyNow r) {
		// TODO Auto-generated method stub
		return  BuyRepo.save(r);
	}

	@Override
	public List<BuyNow> getAll() {
		// TODO Auto-generated method stub
		return BuyRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		BuyRepo.deleteById(ri);
	}

	@Override
	public BuyNow updaterecord(int i, BuyNow r) {
		// TODO Auto-generated method stub
		Optional<BuyNow> opt=BuyRepo.findById(i);
		if(opt.isPresent())
		{
			BuyNow rold=opt.get();
			rold.setProductname(r.getProductname());
			rold.setPrice(r.getPrice());
			rold.setQuantity(r.getQuantity());
			rold.setAddress(r.getAddress());
			rold.setPhone(r.getPhone());
			
			
			
			return BuyRepo.save(rold);
		}
		return null;
	}
	

}
