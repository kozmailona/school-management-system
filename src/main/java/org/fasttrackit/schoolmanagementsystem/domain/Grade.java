package org.fasttrackit.schoolmanagementsystem.domain;

import javax.persistence.Entity;

@Entity
public class Grade {

	private Long id;

	private int mark;

	private Teacher teacher;

	private Register register;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

}
