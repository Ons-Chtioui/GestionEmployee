package net.javaguides.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.ems.dto.EmployeeDto;
@Service
public interface EmployeeService {
 
   EmployeeDto createEmployee(EmployeeDto employeeDto);
 
   EmployeeDto getEmployeeById(Long employeeId );
   
   List<EmployeeDto> getAllEmployees();
   
   EmployeeDto updatedEmployee(Long employeeId , EmployeeDto updatedEmployee);
 
   void deleteEmployee(Long employeeId);
}
