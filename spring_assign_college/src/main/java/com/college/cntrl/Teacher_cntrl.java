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


import com.college.entity.Teacher_enetity;

import com.college.repo.Teacher_repo;

@RestController
@RequestMapping("/teacher")
public class Teacher_cntrl {

	@Autowired
	Teacher_repo tr;
	
	@GetMapping("/")
	public List<Teacher_enetity> showdata(){
		return tr.findAll();
	}
	
	@PostMapping("/")
	public List<Teacher_enetity> adddata(@RequestBody Teacher_enetity ab){
		tr.save(ab);
		return tr.findAll();
	}
	
	@PutMapping("/")
	public List<Teacher_enetity> updateata(@RequestBody Teacher_enetity abc){
		tr.save(abc);
		return tr.findAll();
	}
	@DeleteMapping("/{id}")
	public List<Teacher_enetity> deletedata(@PathVariable int id){
		tr.deleteById(id);
		return tr.findAll();
	}

}
