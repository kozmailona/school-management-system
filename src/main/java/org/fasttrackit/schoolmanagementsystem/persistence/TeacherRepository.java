package org.fasttrackit.schoolmanagementsystem.persistence;

import org.fasttrackit.schoolmanagementsystem.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
