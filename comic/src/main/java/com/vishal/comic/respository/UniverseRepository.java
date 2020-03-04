package com.vishal.comic.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.comic.entity.Universe;
@Repository
public interface UniverseRepository extends JpaRepository<Universe, Integer> {

	Universe findByuniverseName(String universeName);

}
