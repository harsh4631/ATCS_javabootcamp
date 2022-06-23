package com.college.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Admission_enetity;

import com.college.repo.Admission_repo;


@RestController
@RequestMapping("/admission")
public class Admission_cntrl {

	@Autowired
	Admission_repo ar;
	
	@GetMapping("/")
	public ResponseEntity<List<Admission_enetity>> showdata(){
		
		return new ResponseEntity<List<Admission_enetity>>(ar.findAll(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> adddata(@RequestBody Admission_enetity ab){
		if((ab.getFees()<10000) || (ab.getRollno()<40)) {
			return new ResponseEntity<String>("error",HttpStatus.BAD_REQUEST);
		}
		else {
			ar.save(ab);
			return new ResponseEntity("sucessful",HttpStatus.CREATED);
		}
	}
	@PutMapping("/")
	public List<Admission_enetity> updatedata(@RequestBody Admission_enetity abc){
		ar.save(abc);
		return ar.findAll();
	}
}
