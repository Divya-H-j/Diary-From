package com.Project.Dairy.Project.model;

import java.util.Set;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;



@Entity
public class Prodect {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private int imgid;
private String prodectname,prise;

@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinTable(name="prodectImages",joinColumns= {
		@JoinColumn(name="prodect_id")
},
inverseJoinColumns= {
		@JoinColumn(name="image_id")
}
)
private Set<ImageModel> prodectImages;



public Set<ImageModel> getprodectImages() {
	return prodectImages;
}
public void setprodectImages(Set<ImageModel> prodectImages) {
	this.prodectImages = prodectImages;
}
public Prodect() {
	super();
	// TODO Auto-generated constructor stub
}
public Prodect(String prodectname,  String prise) {
	super();
	this.prodectname = prodectname;
	
	this.prise = prise;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getImgid() {
	return imgid;
}
public void setImgid(int imgid) {
	this.imgid = imgid;
}
public String getProdectname() {
	return prodectname;
}
public void setProdectname(String prodectname) {
	this.prodectname = prodectname;
}
public String getPrise() {
	return prise;
}
public void setPrise(String prise) {
	this.prise = prise;
}
public Set<ImageModel> getProdectImages() {
	return prodectImages;
}
public void setProdectImages(Set<ImageModel> prodectImages) {
	this.prodectImages = prodectImages;
}
@Override
public String toString() {
	return "Prodect [id=" + id + ", imgid=" + imgid + ", prodectname=" + prodectname + ", prise=" + prise
			+ ", prodectImages=" + prodectImages + "]";
}


}
