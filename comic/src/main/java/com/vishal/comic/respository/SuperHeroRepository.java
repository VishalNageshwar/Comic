package com.vishal.comic.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.comic.entity.Power;
import com.vishal.comic.entity.SuperHero;
@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, Integer> {

	SuperHero findBysuperHeroName(String superHeroName);

}
