package com.Project.Dairy.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BuyNow {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int buyid;

private String firstname,lastname,productname,price,quantity,address,phone;

public BuyNow() {
	super();
	// TODO Auto-generated constructor stub
}

public BuyNow(String firstname,String lastname, String productname, String price, String quantity, String address, String phone) {
	super();
	this.firstname=firstname;
	this.lastname=lastname;
	this.address = address;
	this.phone = phone;
	this.productname = productname;
	this.quantity = quantity;
	this.price = price;
	
	
}

public int getBuyid() {
	return buyid;
}

public void setBuyid(int buyid) {
	this.buyid = buyid;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getProductname() {
	return productname;
}

public void setProductname(String productname) {
	this.productname = productname;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getQuantity() {
	return quantity;
}

public void setQuantity(String quantity) {
	this.quantity = quantity;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

@Override
public String toString() {
	return "BuyNow [buyid=" + buyid + ", firstname=" + firstname + ", lastname=" + lastname + ", productname="
			+ productname + ", price=" + price + ", quantity=" + quantity + ", address=" + address + ", phone=" + phone
			+ "]";
}




}
