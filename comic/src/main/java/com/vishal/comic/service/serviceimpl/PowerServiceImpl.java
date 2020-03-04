package com.vishal.comic.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.comic.entity.Power;
import com.vishal.comic.entity.SuperHero;
import com.vishal.comic.respository.PowerRepository;
import com.vishal.comic.respository.SuperHeroRepository;
import com.vishal.comic.service.PowerService;
@Service
public class PowerServiceImpl implements PowerService {
	@Autowired
	SuperHeroRepository herorepo;
	@Autowired
	PowerRepository powrepo;
	@Override
	public void assignpower(String superHeroName, Power power) {
		SuperHero hero=herorepo.findBysuperHeroName(superHeroName);
		power.setSuperhero(hero);
		powrepo.save(power);
		
	}

}
