package com.security.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.security.model.Employee;



@EnableJpaRepositories
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Employee findByEmail(String emial);


//	@Query(value = "SELECT * FROM employee e where e.email = :email AND e.password = :password", nativeQuery = true)
//	Optional<Employee> findByEmailAndPassword(String emial, String password);
	
	
	
//	@Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :nofQuestions", nativeQuery=true)
//	List<Question> findRandomQuestionsByCategory(String category, int nofQuestions);

}
