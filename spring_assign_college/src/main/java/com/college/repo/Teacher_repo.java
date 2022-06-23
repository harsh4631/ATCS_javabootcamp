package com.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.Teacher_enetity;

@Repository
public interface Teacher_repo extends JpaRepository<Teacher_enetity, Integer> {

}
