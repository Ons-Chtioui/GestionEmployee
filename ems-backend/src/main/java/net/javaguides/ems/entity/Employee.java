package net.javaguides.ems.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import lombok.Getter;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="employees")


public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(name="first_name")
private String firstName;

@Column(name="last_name")
private String lastName;

@Column(name="email_id",nullable=false,unique=true)
private String email;

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

public Employee(Long id, String firstName, String lastName, String email) {
	// TODO Auto-generated constructor stub
	   this.id=id;
	   this.firstName=firstName;
	   this.lastName=lastName;
	   this.email=email;
}
public Employee() {}

public void setFirstName(String firstName) {
	this.firstName=firstName;
	
}

public void setLasttName(String lastName) {
	this.lastName=lastName;
	
}

public void setEmail(String email) {
	this.email=email;
};

}
