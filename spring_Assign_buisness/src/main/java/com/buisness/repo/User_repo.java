package com.buisness.repo;

import java.math.BigInteger;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buisness.entity.Users;

@Repository
public interface User_repo extends JpaRepository<Users, BigInteger> {

	

}
