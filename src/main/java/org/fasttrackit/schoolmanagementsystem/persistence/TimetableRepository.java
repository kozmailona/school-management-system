package org.fasttrackit.schoolmanagementsystem.persistence;

import org.fasttrackit.schoolmanagementsystem.domain.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface  TimetableRepository extends JpaRepository<Timetable, Date> {
}
