package com.mikkita.spring.springboot.spring_course_springboot_data_jpa.dao;





import com.mikkita.spring.springboot.spring_course_springboot_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
