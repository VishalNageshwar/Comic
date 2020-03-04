package com.vishal.comic.service;

import java.util.List;

import com.vishal.comic.entity.SuperHero;

public interface SuperHeroService {

	void assign(String universeName, SuperHero superhero);

	List<SuperHero> getherolist();

}
