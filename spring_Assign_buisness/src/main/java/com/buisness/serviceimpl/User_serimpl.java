package com.buisness.serviceimpl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


import com.buisness.entity.Users;
import com.buisness.repo.User_repo;
import com.buisness.service.User_service;

@Component
public class User_serimpl implements User_service {
	
	@Autowired
	User_repo ur;

	@Override
	public List<Users> showdatanew() {
		return ur.findAll();
	}

	@Override
	public Optional<Users> showidnew(BigInteger id) {
		return ur.findById(id);
	}

	@Override
	public List<Users> adddatanew(Users ab) throws InvalidEmailException, Passwordformat {
		
		String password=ab.getPassword();
		String email=ab.getEmailid();
		
		 
		
		if(checkEmail(email)==false)
			throw new InvalidEmailException();
		
		
		if(checkPassword(password)==false)
			throw new Passwordformat();
		
		if(checkEmail(email) && checkPassword(password))
			ur.save(ab);
		
		
		
		return ur.findAll();
		
	}

	private boolean checkEmail(String email) {
		String emailRegex ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
				
 Pattern pat = Pattern.compile(emailRegex); 
  if (email == null)
   return false;
   return pat.matcher(email).matches();
	}

	private boolean checkPassword(String password) {
		String passRegex="^(?=.*[@$!%*#?&])(?=.*[a-zA-Z]).{10,}$";
		
				Pattern pat = Pattern.compile(passRegex); 
		  if (password == null)
		   return false;
		   return pat.matcher(password).matches();			
				
	}
	

	@Override
	public List<Users> updatenew(Users abc) throws InvalidEmailException, Passwordformat {
		String password=abc.getPassword();
		String email=abc.getEmailid();
		
		 
		
		if(checkEmail(email)==false)
			throw new InvalidEmailException();
		
		
		if(checkPassword(password)==false)
			throw new Passwordformat();
		
		if(checkEmail(email) && checkPassword(password))
			ur.save(abc);
		
		
		
		return ur.findAll();
	}

	@Override
	public Optional<Users> deletenew(BigInteger id) {
		return ur.findById(id);
	}



	
}
