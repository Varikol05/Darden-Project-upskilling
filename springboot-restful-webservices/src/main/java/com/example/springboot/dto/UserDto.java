package com.example.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Schema(
		description = "userDto Model Infomation"
		)
	

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private long id;
	
	
	@Schema(
			description = "user first name"
			)
	@NotEmpty(message = "User first name should not be null or empty")
	private String firstName;
	
	
	@Schema(
			description = "user last name"
			)
	@NotEmpty(message = "User first name should not be null or empty")
	private String lastName;
	
	
	@Schema(
			description = "user email address"
			)
	@NotEmpty(message = "User first name should not be null or empty")
	@Email(message = "Email address should be valid")
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	public UserDto(long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
