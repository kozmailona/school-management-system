package org.fasttrackit.schoolmanagementsystem.persistence;

import org.fasttrackit.schoolmanagementsystem.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    public void createAttendance();
    
}
