package org.fasttrackit.schoolmanagementsystem.dto;

import java.util.ArrayList;
import java.util.List;

import org.fasttrackit.schoolmanagementsystem.domain.Grade;
import org.fasttrackit.schoolmanagementsystem.domain.SubjectInfo;
import org.fasttrackit.schoolmanagementsystem.domain.Teacher;

public class RegisterDTO {

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

}
