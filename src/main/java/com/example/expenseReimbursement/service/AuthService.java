//package com.example.expenseReimbursement.service;
//
//import com.example.expenseReimbursement.dto.AuthResponse;
//import com.example.expenseReimbursement.dto.LoginRequest;
//import com.example.expenseReimbursement.entity.Employee;
//import com.example.expenseReimbursement.repository.EmployeeRepository;
//import com.example.expenseReimbursement.util.JwtUtil;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import com.example.expenseReimbursement.dto.SignupRequest;
//
//@Service
//@Transactional
//public class AuthService {
//
//    private final EmployeeRepository employeeRepository;
//    private final JwtUtil jwtUtil;
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public AuthService(EmployeeRepository employeeRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder) {
//        this.employeeRepository = employeeRepository;
//        this.jwtUtil = jwtUtil;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Transactional
//    public AuthResponse signup(SignupRequest request) {
//        if (employeeRepository.existsByEmail(request.getEmail())) {
//            throw new RuntimeException("User already exists");
//        }
//
//        Employee employee = new Employee(
//                request.getName(),
//                request.getEmail(),
//                passwordEncoder.encode(request.getPassword()),
//                request.getRole(),
//                request.getPhoneNumber(),
//                request.getAccNo(),
//                request.getIfscCode(),
//                request.getDob()
//        );
//
//        employeeRepository.save(employee);
////        employeeRepository.save(employee);
//        System.out.println("Saved employee: " + employee.getEmail());
//
//        String token = jwtUtil.generateToken(employee);
//        return new AuthResponse(token);
//    }
//
//    public AuthResponse login(LoginRequest request) {
//        Employee employee = employeeRepository.findByEmail(request.getEmail())
//                .orElseThrow(() -> new RuntimeException("User not found"));
//
//        if (!passwordEncoder.matches(request.getPassword(), employee.getPassword())) {
//            throw new RuntimeException("Invalid credentials");
//        }
//
//        String token = jwtUtil.generateToken(employee);
//        System.out.println("Login Successful!!");
//        return new AuthResponse(token);
//    }
//}
