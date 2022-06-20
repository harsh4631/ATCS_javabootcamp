package com.springsecond.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecond.entity.Companyentity;
@Repository
public interface Companyrepo extends JpaRepository<Companyentity, Integer> {

}
