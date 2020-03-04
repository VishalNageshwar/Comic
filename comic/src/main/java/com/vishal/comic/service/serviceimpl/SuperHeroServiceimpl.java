package com.vishal.comic.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.comic.entity.SuperHero;
import com.vishal.comic.entity.Universe;
import com.vishal.comic.respository.SuperHeroRepository;
import com.vishal.comic.respository.UniverseRepository;
import com.vishal.comic.service.SuperHeroService;
@Service
public class SuperHeroServiceimpl implements SuperHeroService {
@Autowired
UniverseRepository unirepo;
@Autowired
SuperHeroRepository herorepo;
	@Override
	public void assign(String universeName, SuperHero superhero) {
		Universe u=unirepo.findByuniverseName(universeName);
		if(u.getSuperHeroCapacity()>herorepo.findAll().size()) {
		superhero.setUniverse(u);
		herorepo.save(superhero);
		
	}
	}
	@Override
	public List<SuperHero> getherolist() {
	List<SuperHero>heros=herorepo.findAll();
		return heros;
	}
}
