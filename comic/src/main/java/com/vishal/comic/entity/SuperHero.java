package com.vishal.comic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SuperHero {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int superHeroId;
private String superHeroName;
private String superHeroPower;
@OneToMany(mappedBy = "superhero",cascade=CascadeType.ALL)
private List<Power>powers;
@ManyToOne
Universe universe;
public SuperHero() {
	super();
	// TODO Auto-generated constructor stub
}
public SuperHero(int superHeroId, String superHeroName, String superHeroPower, List<Power> powers, Universe universe) {
	super();
	this.superHeroId = superHeroId;
	this.superHeroName = superHeroName;
	this.superHeroPower = superHeroPower;
	this.powers = powers;
	this.universe = universe;
}
public int getSuperHeroId() {
	return superHeroId;
}
public void setSuperHeroId(int superHeroId) {
	this.superHeroId = superHeroId;
}
public String getSuperHeroName() {
	return superHeroName;
}
public void setSuperHeroName(String superHeroName) {
	this.superHeroName = superHeroName;
}
public String getSuperHeroPower() {
	return superHeroPower;
}
public void setSuperHeroPower(String superHeroPower) {
	this.superHeroPower = superHeroPower;
}
public List<Power> getPowers() {
	return powers;
}
public void setPowers(List<Power> powers) {
	this.powers = powers;
}
public Universe getUniverse() {
	return universe;
}
public void setUniverse(Universe universe) {
	this.universe = universe;
}
@Override
public String toString() {
	return "SuperHero [superHeroId=" + superHeroId + ", superHeroName=" + superHeroName + ", superHeroPower="
			+ superHeroPower + ", powers=" + powers + ", universe=" + universe + "]";
}

}
