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

import com.Project.Dairy.Project.model.BuyNow;
import com.Project.Dairy.Project.model.Contacts;
import com.Project.Dairy.Project.service.BuyNowService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/BuyNow/")
@RestController
public class BuyNowController {

	@Autowired
	private BuyNowService bs;
	@GetMapping("/BuyNows")
	public List<BuyNow> handleget()
	{
		return bs.getAll();
	}
	
	@PostMapping("/addBuy")
	public BuyNow add(@RequestBody BuyNow r)
	{
		return bs.insertrecord(r);
	}
	
	@DeleteMapping("/delBuy/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		bs.del(r);
	}

	@PutMapping("/upcon/{rid}")
	public BuyNow update(@PathVariable("rid")int i,@RequestBody BuyNow r)
	{
		return bs.updaterecord(i,r);
	}
}
