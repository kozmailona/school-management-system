package org.fasttrackit.schoolmanagementsystem.dto;

import java.util.Date;

public class AttendanceDTO {

    private boolean isPresent;

    private Date date;

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AttendanceDTO{" +
                "isPresent=" + isPresent +
                ", date=" + date +
                '}';
    }
}
