package com.ajwinchester.springdata.idgenerators;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ajwinchester.springdata.idgenerators.entities.Customer;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IdgeneratorsApplicationTests {

	@Autowired
	CustomerRepository repository;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreate()
	{
		Customer customer = new Customer();
		
		customer.setName("McLaren 12c spyder");
		
		repository.save(customer);
	}
}

