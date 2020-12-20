package org.fasttrackit.schoolmanagementsystem.persistence;

import java.util.List;

import org.fasttrackit.schoolmanagementsystem.domain.Grade;
import org.fasttrackit.schoolmanagementsystem.domain.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {

	List<Grade> findAllGradesByStudent(String userName);

}
