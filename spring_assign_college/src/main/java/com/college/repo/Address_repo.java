package com.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.Address_enetity;
@Repository

public interface Address_repo extends JpaRepository<Address_enetity, Integer> {

}
