package com.Project.Dairy.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Dairy.Project.model.Contacts;

import com.Project.Dairy.Project.service.ContactsService;


@CrossOrigin(origins="http://localhost:9090")
@RequestMapping("/contacts/")
@RestController
public class ContactsController {
	
	@Autowired
	private ContactsService cs;
	@GetMapping("/contacts")
	public List<Contacts> handleget()
	{
		return cs.getAll();
	}

	@PostMapping("/addcon")
	public Contacts add(@RequestBody Contacts r)
	{
		return cs.insertrecord(r);
	}

	@DeleteMapping("/delcon/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		cs.del(r);
	}

	@PutMapping("/upcon/{rid}")
	public Contacts update(@PathVariable("rid")int i,@RequestBody Contacts r)
	{
		return cs.updaterecord(i,r);
	}

}
