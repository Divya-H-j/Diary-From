package com.Project.Dairy.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Project.Dairy.Project.model.Contacts;

import com.Project.Dairy.Project.repository.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService{

	@Autowired
	@Qualifier("conRepo")
	private ContactsRepository conRepo;
	
	@Override
	public Contacts insertrecord(Contacts r) {
		// TODO Auto-generated method stub
		return  conRepo.save(r);
	}

	@Override
	public List<Contacts> getAll() {
		// TODO Auto-generated method stub
		return conRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		conRepo.deleteById(ri);
	}

	@Override
	public Contacts updaterecord(int i, Contacts r) {
		// TODO Auto-generated method stub
		Optional<Contacts> opt=conRepo.findById(i);
		if(opt.isPresent())
		{
			Contacts rold=opt.get();
			rold.setName(r.getName());
			rold.setEmailid(r.getEmailid());
			rold.setPhone(r.getPhone());
			rold.setMessage(r.getMessage());
			
			
			return conRepo.save(rold);
		}
		return null;
	}

}
