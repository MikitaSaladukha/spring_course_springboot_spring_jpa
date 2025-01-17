package com.mikkita.spring.springboot.spring_course_springboot_data_jpa.service;





import com.mikkita.spring.springboot.spring_course_springboot_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
