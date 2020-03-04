package com.vishal.comic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Power {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int powerId;
private String powerName;
private int powerStrength;
@ManyToOne
private SuperHero superhero;
public Power() {
	super();
	// TODO Auto-generated constructor stub
}
public Power(int powerId, String powerName, int powerStrength, SuperHero superhero) {
	super();
	this.powerId = powerId;
	this.powerName = powerName;
	this.powerStrength = powerStrength;
	this.superhero = superhero;
}
public int getPowerId() {
	return powerId;
}
public void setPowerId(int powerId) {
	this.powerId = powerId;
}
public String getPowerName() {
	return powerName;
}
public void setPowerName(String powerName) {
	this.powerName = powerName;
}
public int getPowerStrength() {
	return powerStrength;
}
public void setPowerStrength(int powerStrength) {
	this.powerStrength = powerStrength;
}
public SuperHero getSuperhero() {
	return superhero;
}
public void setSuperhero(SuperHero superhero) {
	this.superhero = superhero;
}
@Override
public String toString() {
	return "Power [powerId=" + powerId + ", powerName=" + powerName + ", powerStrength=" + powerStrength
			+ ", superhero=" + superhero + "]";
}

}
