package com.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.Admission_enetity;
@Repository

public interface Admission_repo extends JpaRepository<Admission_enetity, Integer> {

}
