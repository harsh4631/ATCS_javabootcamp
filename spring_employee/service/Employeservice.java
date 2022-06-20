package com.springsecond.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springsecond.entity.Employeentity;

@Service
public interface Employeservice {
	
	public List<Employeentity> showdata();
	
	public Optional<Employeentity> showid(@PathVariable int id);
	
	public List<Employeentity> adddata(@RequestBody Employeentity eme);
	
	public List<Employeentity> updatedata(@RequestBody Employeentity em);
	
	public List<Employeentity> deletedata(@PathVariable int id);
}