package org.fasttrackit.schoolmanagementsystem.domain;

import java.util.List;

public class Student extends UserDetail {

	private List<Grade> grades;

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
}
