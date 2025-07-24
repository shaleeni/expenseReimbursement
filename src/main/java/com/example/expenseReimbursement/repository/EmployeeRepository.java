package com.example.expenseReimbursement.repository;

import com.example.expenseReimbursement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
