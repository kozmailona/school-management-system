package org.fasttrackit.schoolmanagementsystem.dto;

import java.util.Date;
import java.util.List;

import org.fasttrackit.schoolmanagementsystem.domain.SubjectInfo;
import org.fasttrackit.schoolmanagementsystem.domain.UserRole;

public class UserDetailDTO {

	private Long id;

	private String name;

	private String phoneNumber;

	private String emailAddress;

	private String password;

	private UserRole role;

	private Date birthday;

	private int age;

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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
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

	public List<SubjectInfo> getSubjectInfos() {
		return subjectInfos;
	}

	public void setSubjectInfo(List<SubjectInfo> subjectInfos) {
		this.subjectInfos = subjectInfos;
	}
}
