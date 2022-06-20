package com.buisness.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.buisness.entity.Users;
import com.buisness.serviceimpl.InvalidEmailException;
import com.buisness.serviceimpl.Passwordformat;

@Service
public interface User_service  {

	public List<Users> showdatanew();
	
	public Optional<Users> showidnew(@PathVariable BigInteger id);
	
	public List<Users> adddatanew(@RequestBody Users ab)  throws InvalidEmailException, Passwordformat;
	
	public List<Users> updatenew(@RequestBody Users abc)  throws InvalidEmailException, Passwordformat;
	
	public Optional<Users> deletenew(@PathVariable BigInteger id);
}
