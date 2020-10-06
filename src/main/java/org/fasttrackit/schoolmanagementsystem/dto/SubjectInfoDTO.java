package org.fasttrackit.schoolmanagementsystem.dto;

import org.fasttrackit.schoolmanagementsystem.domain.SubjectName;

public class SubjectInfoDTO {

    private int subjectID;

    private SubjectName subjectName;

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public SubjectName getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(SubjectName subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "SubjectInfoDTO{" +
                "subjectID=" + subjectID +
                ", subjectName=" + subjectName +
                '}';
    }
}
