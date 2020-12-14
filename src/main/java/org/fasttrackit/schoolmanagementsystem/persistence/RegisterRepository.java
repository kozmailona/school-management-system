package org.fasttrackit.schoolmanagementsystem.persistence;

import org.fasttrackit.schoolmanagementsystem.domain.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {

}
