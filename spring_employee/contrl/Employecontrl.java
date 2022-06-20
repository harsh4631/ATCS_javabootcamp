package com.springsecond.contrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecond.entity.Employeentity;
import com.springsecond.repo.Employerepo;
import com.springsecond.service.Employeservice;

@RestController
@RequestMapping("/shop")
public class Employecontrl {
    @Autowired
    
	Employeservice employeservice;
	
	@GetMapping("/")
	public List<Employeentity> showdata(){
		return employeservice.showdata();
	}
	
	@GetMapping("/{id}")
	public Optional<Employeentity> showid(@PathVariable int id){
		return employeservice.showid(id);
		
		
	}
	
	
	@PostMapping("/")
	public List<Employeentity> adddata(@RequestBody Employeentity eme){
		return employeservice.adddata(eme);
		
	}
	@PutMapping("/")
	public List<Employeentity> updatedata(@RequestBody Employeentity em){
		return employeservice.updatedata(em);
	}
	@DeleteMapping("/{id}")
	public List<Employeentity> deletedata(@PathVariable int id){
		return employeservice.deletedata(id);
	}
}
