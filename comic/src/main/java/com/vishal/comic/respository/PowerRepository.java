package com.vishal.comic.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.comic.entity.Power;
@Repository 
public interface PowerRepository extends JpaRepository<Power, Integer> {

}
