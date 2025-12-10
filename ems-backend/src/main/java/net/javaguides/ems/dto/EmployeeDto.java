package net.javaguides.ems.dto;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
   private Long id;
   private String firstName;
   private String lastName;
   private String email;
   
   public EmployeeDto(Long id, String firstName, String lastName, String email) {
	// TODO Auto-generated constructor stub
	   this.id=id;
	   this.firstName=firstName;
	   this.lastName=lastName;
	   this.email=email;  
}
   public EmployeeDto( String firstName, String lastName, String email) {
		// TODO Auto-generated constructor stub
		   this.firstName=firstName;
		   this.lastName=lastName;
		   this.email=email;  
	}
   public EmployeeDto() {};

public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}
}

