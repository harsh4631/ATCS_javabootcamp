package com.buisness.serviceimpl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.buisness.entity.User_profile;
import com.buisness.repo.User_profile_repo;
import com.buisness.service.User_profile_service;

@Component
public class User_profile_impl implements User_profile_service{
	
	@Autowired
	User_profile_repo userrepo;

	@Override
	public List<User_profile> showdata() {
		return userrepo.findAll();
	}

	@Override
	public Optional<User_profile> showid(BigInteger id) {
		return userrepo.findById(id);
	}

	@Override
	public List<User_profile> adddata(User_profile ab) {
		userrepo.save(ab);
		return userrepo.findAll();
	}

	@Override
	public List<User_profile> update(User_profile abc) {
		userrepo.save(abc);
		return userrepo.findAll();
	}

	@Override
	public Optional<User_profile> delete(BigInteger id) {
		return userrepo.findById(id);
	}
	

	
}
