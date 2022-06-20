package com.buisness.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.buisness.entity.User_profile;

@Service
public interface User_profile_service {
	
	public List<User_profile> showdata();
	
	public Optional<User_profile> showid(@PathVariable BigInteger id);
	
	public List<User_profile> adddata(@RequestBody User_profile ab);

	public List<User_profile> update(@RequestBody User_profile abc);
	
	public Optional<User_profile> delete(@PathVariable BigInteger id);
}
