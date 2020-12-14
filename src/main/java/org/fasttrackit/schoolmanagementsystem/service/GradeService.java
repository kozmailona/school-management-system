package org.fasttrackit.schoolmanagementsystem.service;

import org.fasttrackit.schoolmanagementsystem.domain.Grade;
import org.fasttrackit.schoolmanagementsystem.exception.ResourceNotFoundException;
import org.fasttrackit.schoolmanagementsystem.persistence.GradeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class GradeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(GradeService.class);

	private GradeRepository gradeRepository;

	@Autowired
	public GradeService(GradeRepository gradeRepository) {
		this.gradeRepository = gradeRepository;
	}

	public Grade getGrade(Long id) {
		LOGGER.info("Retrieving grade {}", id);
		return gradeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Grade " + id + " does not exist"));
	}
}
