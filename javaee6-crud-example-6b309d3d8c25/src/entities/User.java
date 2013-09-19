package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import constraint.Email;

@Entity
public class User {
	private Integer id;
	
	@Size(min = 2, message="First name too short")
	private String firstName;
	
	@Size(min = 2, message="Last name too short")
	private String lastName;
	
	@Email
	private String email;
	
	private Date birthday;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	
	public void setBirthday(Date birthDate) {
		this.birthday = birthDate;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
