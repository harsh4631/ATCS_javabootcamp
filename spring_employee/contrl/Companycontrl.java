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

import com.springsecond.entity.Companyentity;
import com.springsecond.repo.Companyrepo;

@RestController
@RequestMapping("/Company")
public class Companycontrl {
	
	@Autowired
	Companyrepo companyrepo;
	
	@GetMapping("/")
	public List<Companyentity> showdatacomp(){
		return companyrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Companyentity> showidcomp(@PathVariable int emp_id){
		return companyrepo.findById(emp_id);
		
		
	}
	
	
	@PostMapping("/")
	public Companyentity adddatacomp(@RequestBody Companyentity eme){
		return companyrepo.save(eme);
		
	}
	@PutMapping("/")
	public List<Companyentity> updatedata(@RequestBody Companyentity em){
		companyrepo.save(em);
		return companyrepo.findAll();
	}
	@DeleteMapping("/{id}")
	public List<Companyentity> deletedata(@PathVariable int emp_id){
		 companyrepo.deleteById(emp_id);
		 return companyrepo.findAll();
	}

}
