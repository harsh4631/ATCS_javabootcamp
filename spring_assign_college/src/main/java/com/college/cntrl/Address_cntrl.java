package com.college.cntrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Address_enetity;
import com.college.entity.Student_enetity;
import com.college.repo.Address_repo;
import com.college.repo.Student_repo;


@RestController
@RequestMapping("/adress")
public class Address_cntrl {

	@Autowired
	Address_repo ad;
	
	@Autowired
	Student_repo sr;
	
	@GetMapping("/")
	public List<Address_enetity> showdata(){
		return ad.findAll();
	}
	
	@PostMapping("/")
	public List<Address_enetity> adddata(@RequestBody Address_enetity ab){
		ad.save(ab);
		return ad.findAll();
	}
	
	@PutMapping("/")
	public List<Address_enetity> updatedata(@RequestBody Address_enetity abc){
		ad.save(abc);
		return ad.findAll();
	}
	@DeleteMapping("/{id}")
	public List<Address_enetity> del(@PathVariable int id){
		
//		List<Student_enetity> studentList = sr.findAll();
//
//		// iterating the student one by one
//		for (Student_enetity stu : studentList) {
//			// getting the list of address
//			List<Address_enetity> addressList = stu.getAdress();
//			List<Address_enetity> addressListNew=new ArrayList<Address_enetity>();
//			for (Address_enetity ad : addressList) {
//               if(ad.getId()==id)
//               {
//            	  
//               }
//               else
//               {
//            	   addressListNew.add(ad);  
//               }
//			}
//			
//			stu.setAdress(addressListNew);
//			sr.save(stu);
//		}
		ad.deleteById(id);
		return ad.findAll();
	}
}
