package com.ajwinchester.springdata.idgenerators;

import org.springframework.data.repository.CrudRepository;

import com.ajwinchester.springdata.idgenerators.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
