package com.connectivity.joiningDatabaseProject1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connectivity.joiningDatabaseProject.Customer;

@RestController
public class CustController {

	@Autowired
	SessionFactory sessionfactory;

	@GetMapping("showcustomer")
	public List<Cust> showcustomer() {
		Session session = sessionfactory.openSession();
		List<Cust> cust = (List<Cust>) session.createCriteria(Cust.class).list();
		return cust;
	}

	@PostMapping("Addcustomer")
	public String m1(@RequestBody Cust customer) {
		Session session = sessionfactory.openSession();
		Transaction tt = session.beginTransaction();
		session.save(customer);
		tt.commit();
		return "added successfully";
	}

	@PutMapping("Updatedcustomer")
	public String m2(@RequestBody Cust customer) {
		Session session = sessionfactory.openSession();
		Transaction tt = session.beginTransaction();
		session.update(customer);
		tt.commit();
		return "successfully updated customer";
	}

	@DeleteMapping("Deletedcustomer")
	public String m3(@RequestBody Cust customer) {
		Session session = sessionfactory.openSession();
		Transaction tt = session.beginTransaction();
		session.delete(customer);
		tt.commit();
		return "successfully deleted customer";
	}
}
