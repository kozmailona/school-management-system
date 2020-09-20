package org.fasttrackit.schoolmanagementsystem.persistence;

import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {

	UserDetail findUserById(long id);

	UserDetail findByEmail(String email);
}
