package org.fasttrackit.schoolmanagementsystem.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Student(Long id, @NotNull String name, @NotNull String gender,
                   @NotNull String phoneNumber, @NotNull String emailAddress,
                   @NotNull long registrationNumber, @NotNull Date birthday, @NotNull int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.registrationNumber = registrationNumber;
        this.birthday = birthday;
        this.age = age;
    }

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
}


