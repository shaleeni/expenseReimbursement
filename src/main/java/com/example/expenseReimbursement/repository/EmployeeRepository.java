package com.example.expenseReimbursement.repository;

import com.example.expenseReimbursement.entity.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	boolean existsByEmail(String email);
	Optional<Employee> findByEmail(String email);
}
