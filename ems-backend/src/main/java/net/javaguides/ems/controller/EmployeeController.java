package net.javaguides.ems.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.service.impl.EmployeeServiceImpl;
@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired 
	private EmployeeServiceImpl employeeService;
 
	// Build add employee REST API  @RequestBody;json=>java object
	//@PostMapping("/api/employees")
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
		if( employeeDto.getFirstName()!= null && employeeDto.getLastName()!= null) {
			try { 
                EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
                return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
            } catch (Exception e) {
                // Handle the exception
                //e.printStackTrace(); // Print the exception stack trace for debugging
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }			
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);				
		}

		}
/*	@GetMapping("/api/employees")
	public ResponseEntity<EmployeeDto> getEmployee(@RequestParam(name = "param1", required = true) String param1, @RequestBody EmployeeDto employeeDto){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);				
	}*/
	
	// Build Get Employee Rest API
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
		
                EmployeeDto employeeDto = employeeService.getEmployeeById( employeeId);
                return  ResponseEntity.ok(employeeDto);
		} 
	// Build Get All Employees Rest API
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		
               List< EmployeeDto> employees = employeeService.getAllEmployees();
                return  ResponseEntity.ok(employees);
		} 
	//Build Update Employee REST API
	@PutMapping("{id}")
	public ResponseEntity<EmployeeDto> updatedEmployee( @PathVariable("id")Long employeeId ,@RequestBody EmployeeDto updatedEmployee){
		
        EmployeeDto employeeDto = employeeService.updatedEmployee( employeeId,updatedEmployee);
        return  ResponseEntity.ok(employeeDto);
        }
	//Build Delete Employee REST API
	@DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee( @PathVariable("id")Long employeeId ){
		
         employeeService.deleteEmployee( employeeId);
        return  ResponseEntity.ok("Employee deleted successfully!.");
        }
	
	
}


