package org.fasttrackit.schoolmanagementsystem.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class UserDetail {

	@Id
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "phoneNumber", unique = true)
	private String phoneNumber;

	@NotNull
	@Column(name = "email", unique = true)
	private String emailAddress;

	@NotNull
	@Column(name = "password", unique = true)
	private String password;

	@NotNull
	@Column(name = "role", unique = true)
	private UserRole role;

	@NotNull
	@Column(name = "birthday")
	private Date birthday;

	@NotNull
	@Column(name = "age")
	private int age;

	@NotNull
	@Column(name = "subjectInfos")
	private List<SubjectInfo> subjectInfos;

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

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public List<SubjectInfo> getSubjectInfos() {
		return subjectInfos;
	}

	public void setSubjectInfo(List<SubjectInfo> subjectInfos) {
		this.subjectInfos = subjectInfos;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + ", password=" + password + ", role=" + role + ", birthday=" + birthday + ", age=" + age
				+ "]";
	}

}
