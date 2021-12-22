package com.springboot.rest1.com_springboot_rest1.dao;


import com.springboot.rest1.com_springboot_rest1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
     //List<Employee> findAllByName(String name);
    // Формирует адресс /employees

}
