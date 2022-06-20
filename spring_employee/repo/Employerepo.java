package com.springsecond.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecond.entity.Employeentity;

@Repository
public interface Employerepo extends JpaRepository<Employeentity, Integer>{

	
}
