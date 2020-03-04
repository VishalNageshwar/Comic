package com.vishal.comic.service;

import java.util.List;

import com.vishal.comic.entity.Universe;

public interface UniverseService {

	void adduniverse(Universe universe);

	List<Universe> getuniverselist();

}
