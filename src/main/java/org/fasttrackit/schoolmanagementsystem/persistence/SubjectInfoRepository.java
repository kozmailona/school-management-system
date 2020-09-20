package org.fasttrackit.schoolmanagementsystem.persistence;

import org.fasttrackit.schoolmanagementsystem.domain.SubjectInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectInfoRepository extends JpaRepository<SubjectInfo, Integer> {
}
