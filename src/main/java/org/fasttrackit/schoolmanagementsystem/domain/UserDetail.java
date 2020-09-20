package org.fasttrackit.schoolmanagementsystem.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public abstract class UserDetail {

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
	@Column(name = "regNumber")
	private long registrationNumber;

	@NotNull
	@Column(name = "birthday")
	private Date birthday;

	@NotNull
	@Column(name = "age")
	private int age;

	@NotNull
	private List<SubjectInfo> subjectInfo;

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

	public List<SubjectInfo> getSubjectInfo() {
		return subjectInfo;
	}

	public void setSubjectInfo(List<SubjectInfo> subjectInfo) {
		this.subjectInfo = subjectInfo;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", gender=" + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + ", registrationNumber=" + registrationNumber + ", birthday="
				+ birthday + ", age=" + age + ", subjectInfo=" + subjectInfo + "]";
	}

}
