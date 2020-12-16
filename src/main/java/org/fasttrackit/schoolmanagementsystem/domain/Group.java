package org.fasttrackit.schoolmanagementsystem.domain;

import java.util.List;

public class Group {

	private Long id;

	private String nameOfGroup;

	private int numberOfMembers;

	private List<Student> listOfMembers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOfGroup() {
		return nameOfGroup;
	}

	public void setNameOfGroup(String nameOfGroup) {
		this.nameOfGroup = nameOfGroup;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public List<Student> getListOfMembers() {
		return listOfMembers;
	}

	public void setListOfMembers(List<Student> listOfMembers) {
		this.listOfMembers = listOfMembers;
	}

}
