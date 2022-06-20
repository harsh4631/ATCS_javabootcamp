package com.springsecond.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springsecond.entity.Employeentity;
import com.springsecond.repo.Employerepo;
import com.springsecond.service.Employeservice;

@Component
public class Employeserviceimpl implements Employeservice{

	@Autowired
	Employerepo employerepo;

	@Override
	public List<Employeentity> showdata() {
		List<Employeentity> emp=employerepo.findAll();
//		employerepo.findAll();
		return emp;
	}

	@Override
	public Optional<Employeentity> showid(int id) {
		employerepo.findById(id);
		return employerepo.findById(id);
	}

	@Override
	public List<Employeentity> adddata(Employeentity eme) {
		employerepo.save(eme);
		return employerepo.findAll();
	}

	@Override
	public List<Employeentity> updatedata(Employeentity em) {
		employerepo.save(em);
		return employerepo.findAll();
	}

	@Override
	public List<Employeentity> deletedata(int id) {
		employerepo.deleteById(id);
		return employerepo.findAll();
	}
	
}
