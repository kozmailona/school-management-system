package org.fasttrackit.schoolmanagementsystem.persistence;

import org.fasttrackit.schoolmanagementsystem.domain.Grade;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<Grade, Long> {

}
