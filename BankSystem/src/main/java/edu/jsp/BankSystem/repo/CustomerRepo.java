package edu.jsp.BankSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.BankSystem.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
