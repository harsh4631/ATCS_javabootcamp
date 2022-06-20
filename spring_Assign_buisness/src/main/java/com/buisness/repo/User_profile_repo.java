package com.buisness.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buisness.entity.User_profile;

@Repository
public interface User_profile_repo extends JpaRepository<User_profile, BigInteger> {

}
