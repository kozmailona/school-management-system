package org.fasttrackit.schoolmanagementsystem.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Register {

	private Long id;

	private Teacher teacher;

	private List<Grade> grades = new ArrayList<>();

	private List<SubjectInfo> subjectInfos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public List<SubjectInfo> getSubjectInfos() {
		return subjectInfos;
	}

	public void setSubjectInfos(List<SubjectInfo> subjectInfos) {
		this.subjectInfos = subjectInfos;
	}

	public void addMarkToRegister(Grade grade) {
		grades.add(grade);
	}

	public void removeMarkFromRegister(Grade grade) {
		grades.remove(grade);
	}
}
