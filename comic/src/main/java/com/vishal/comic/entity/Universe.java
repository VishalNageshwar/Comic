package com.vishal.comic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Universe {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int universeId;
private String universeName;
private int superHeroCapacity;
@OneToMany(mappedBy = "universe",cascade=CascadeType.ALL)
private List<SuperHero>superheros;
public Universe() {
	super();
	// TODO Auto-generated constructor stub
}
public Universe(int universeId, String universeName, int superHeroCapacity, List<SuperHero> superheros) {
	super();
	this.universeId = universeId;
	this.universeName = universeName;
	this.superHeroCapacity = superHeroCapacity;
	this.superheros = superheros;
}
public int getUniverseId() {
	return universeId;
}
public void setUniverseId(int universeId) {
	this.universeId = universeId;
}
public String getUniverseName() {
	return universeName;
}
public void setUniverseName(String universeName) {
	this.universeName = universeName;
}
public int getSuperHeroCapacity() {
	return superHeroCapacity;
}
public void setSuperHeroCapacity(int superHeroCapacity) {
	this.superHeroCapacity = superHeroCapacity;
}
public List<SuperHero> getSuperheros() {
	return superheros;
}
public void setSuperheros(List<SuperHero> superheros) {
	this.superheros = superheros;
}
@Override
public String toString() {
	return "Universe [universeId=" + universeId + ", universeName=" + universeName + ", superHeroCapacity="
			+ superHeroCapacity + ", superheros=" + superheros + "]";
}


}
