package org.fasttrackit.schoolmanagementsystem.dto;

public class GradeDTO {

    private Long id;

    private int grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "GradeDTO{" +
                "id=" + id +
                ", grade=" + grade +
                '}';
    }
}
