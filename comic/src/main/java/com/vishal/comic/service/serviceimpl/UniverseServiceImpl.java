package com.vishal.comic.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.comic.entity.Universe;
import com.vishal.comic.respository.UniverseRepository;
import com.vishal.comic.service.UniverseService;
@Service
public class UniverseServiceImpl implements UniverseService{
@Autowired
UniverseRepository unirepo;
	@Override
	public void adduniverse(Universe universe) {
		unirepo.save(universe);
		
	}
	@Override
	public List<Universe> getuniverselist() {
		
		List<Universe>unilist=unirepo.findAll();
		return unilist;
	}

}
