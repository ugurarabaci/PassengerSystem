package com.ugurcrud.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="passenger")
public class Passenger {
	
	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@NotBlank(message = "firstname can not be null")
	@Column(name="first_name")
	private String firstName;

	@NotBlank(message = "lastname can not be null")
	@Column(name="last_name")
	private String lastName;

	@NotBlank(message = "phone can not be null")
	@Column(name="email")
	private String email;

	@NotBlank(message = "phone can not be null")
	@Column(name="phone")
	private String phone;

	@Min(value = 1, message = "No need for babies")
	@Column(name = "age")
	private Integer age;

	// define cosntructors
	public Passenger() {}

	public Passenger(String firstName, String lastName, String email, String phone, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}
	
	public Passenger(int id, String firstName, String lastName, String email, String phone, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	// define getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	// define toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
