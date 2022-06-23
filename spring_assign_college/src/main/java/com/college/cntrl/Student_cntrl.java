package com.college.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Student_enetity;
import com.college.repo.Student_repo;

@RestController
@RequestMapping("/student")
public class Student_cntrl {

	@Autowired
	Student_repo sr;
	
	@GetMapping("/")
	public List<Student_enetity> showdata(){
		return sr.findAll();
	}
	
	@PostMapping("/")
	public List<Student_enetity> adddata(@RequestBody Student_enetity ab){
		sr.save(ab);
		return sr.findAll();
	}
	
	@PutMapping("/")
	public List<Student_enetity> updateata(@RequestBody Student_enetity abc){
		sr.save(abc);
		return sr.findAll();
	}
	@DeleteMapping("/{id}")
	public List<Student_enetity> delete(@PathVariable int id){
          sr.deleteById(id);
		return sr.findAll();
	}
	
}
