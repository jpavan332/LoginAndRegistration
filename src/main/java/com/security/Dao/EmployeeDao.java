package com.security.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.model.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
