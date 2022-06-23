package com.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.Student_enetity;

@Repository
public interface Student_repo extends JpaRepository<Student_enetity, Integer> {

}
