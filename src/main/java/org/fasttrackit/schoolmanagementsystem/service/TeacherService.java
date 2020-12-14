package org.fasttrackit.schoolmanagementsystem.service;

import org.fasttrackit.schoolmanagementsystem.domain.Teacher;
import org.fasttrackit.schoolmanagementsystem.exception.ResourceNotFoundException;
import org.fasttrackit.schoolmanagementsystem.persistence.TeacherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TeacherService.class);

	@Autowired
	private TeacherRepository teacherRepository;

	public Teacher getUser(long id) {
		LOGGER.info("Retrieving teacher {}", id);

		return teacherRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Teacher " + id + " does not exist"));
	}
}
