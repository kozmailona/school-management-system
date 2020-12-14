package org.fasttrackit.schoolmanagementsystem.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Grade {

	private Long id;

	private int mark;

	private String nameOfTeacher;

	private List<Register> registers = new ArrayList<>();

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

	public String getNameOfTeacher() {
		return nameOfTeacher;
	}

	public void setNameOfTeacher(String nameOfTeacher) {
		this.nameOfTeacher = nameOfTeacher;
	}

	public List<Register> getRegisters() {
		return registers;
	}

	public void setRegisters(List<Register> registers) {
		this.registers = registers;
	}

}
