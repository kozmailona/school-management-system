package org.fasttrackit.schoolmanagementsystem.transfer;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.fasttrackit.schoolmanagementsystem.domain.SubjectInfo;

public class SaveUserDetailRequest {
	@NotNull
	private String name;

	@NotNull
	private String gender;

	@NotNull
	private String phoneNumber;

	@NotNull
	private String emailAddress;

	@NotNull
	private long registrationNumber;

	@NotNull
	private Date birthday;

	@NotNull
	private int age;

	@NotNull
	private List<SubjectInfo> subjectInfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		return "SaveUserDetailRequest [name=" + name + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ ", emailAddress=" + emailAddress + ", registrationNumber=" + registrationNumber + ", birthday="
				+ birthday + ", age=" + age + ", subjectInfo=" + subjectInfo + "]";
	}

}
