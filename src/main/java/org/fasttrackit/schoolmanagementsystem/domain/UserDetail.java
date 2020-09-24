package org.fasttrackit.schoolmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
//@Table(name = "users")
public class UserDetail {

	@Id
	//@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	//@Column(name = "name")
	private String name;

	@NotNull
	//@Column(name = "phoneNumber", unique = true)
	private String phoneNumber;

	@NotNull
	//@Column(name = "email", unique = true)
	private String emailAddress;

	private String role;

	@NotNull
	//@Column(name = "regNumber")
	private long registrationNumber;

	@NotNull
	//@Column(name = "birthday")
	private Date birthday;

	@NotNull
	//@Column(name = "age")
	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public UserDetail() {
		this.role = role;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@NotNull
	//private List<SubjectInfo> subjectInfo;



	@Override
	public String toString() {
		return "UserDetail{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				", registrationNumber=" + registrationNumber +
				", birthday=" + birthday +
				", age=" + age +
				'}';
	}
}
