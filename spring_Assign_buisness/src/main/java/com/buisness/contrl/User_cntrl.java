package com.buisness.contrl;

import java.math.BigInteger;
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

import com.buisness.entity.Users;
import com.buisness.service.User_service;
import com.buisness.serviceimpl.InvalidEmailException;
import com.buisness.serviceimpl.Passwordformat;

@RestController
@RequestMapping("/user")
public class User_cntrl {

	@Autowired
	User_service us;
	
	@GetMapping("/")
	public List<Users> showdatanew(){
		return us.showdatanew();
	}
	@GetMapping("/{id}")
	public Optional<Users> showidnew(@PathVariable BigInteger id){
		return us.showidnew(id);
	}
	@PostMapping("/")
	public List<Users> adddatanew(@RequestBody Users ab) throws InvalidEmailException, Passwordformat{
		return us.adddatanew(ab);
	}
	@PutMapping("/")
	public List<Users> updatenew(@RequestBody Users abc) throws InvalidEmailException, Passwordformat{
		return us.updatenew(abc);
	}
	@DeleteMapping("/")
	public Optional<Users> deletenew(@PathVariable BigInteger id){
		return us.deletenew(id);
	}
	
	
}
