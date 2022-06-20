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

import com.buisness.entity.User_profile;
import com.buisness.service.User_profile_service;

@RestController
@RequestMapping("/userprofile")
public class User_profile_contrl {


	@Autowired
	
	User_profile_service userservice;
	
	@GetMapping("/")
	public List<User_profile> showdata(){
		return userservice.showdata();
	}
	@GetMapping("/{id}")
	public Optional<User_profile> showid(@PathVariable BigInteger id){
		return userservice.showid(id);
	}
	@PostMapping("/")
	public List<User_profile> adddata(@RequestBody User_profile ab){
		return userservice.adddata(ab);
	}
	@PutMapping("/")
	public List<User_profile> update(@RequestBody User_profile abc){
		return userservice.update(abc);
	}
	@DeleteMapping("/")
	public Optional<User_profile> delete(@PathVariable BigInteger id){
		return userservice.delete(id);
	}
}
