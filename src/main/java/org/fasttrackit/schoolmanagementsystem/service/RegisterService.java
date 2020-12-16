package org.fasttrackit.schoolmanagementsystem.service;

import org.fasttrackit.schoolmanagementsystem.domain.Grade;
import org.fasttrackit.schoolmanagementsystem.domain.Register;
import org.fasttrackit.schoolmanagementsystem.domain.Teacher;
import org.fasttrackit.schoolmanagementsystem.dto.RegisterDTO;
import org.fasttrackit.schoolmanagementsystem.exception.MarkNotFoundException;
import org.fasttrackit.schoolmanagementsystem.exception.ResourceNotFoundException;
import org.fasttrackit.schoolmanagementsystem.persistence.GradeRepository;
import org.fasttrackit.schoolmanagementsystem.persistence.RegisterRepository;
import org.fasttrackit.schoolmanagementsystem.persistence.TeacherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegisterService.class);

	private final RegisterRepository registerRepository;

	private GradeRepository gradeRepository;

	private TeacherRepository teacherRepository;

	private final GradeService gradeService;

	private final TeacherService teacherService;

	@Autowired
	public RegisterService(RegisterRepository registerRepository, GradeService gradeService,
			TeacherService teacherService) {
		this.registerRepository = registerRepository;
		this.gradeService = gradeService;
		this.teacherService = teacherService;
	}

	@Transactional
	public void addGrade(RegisterDTO registerDTO, int mark) {
		LOGGER.info("Adding mark to the register");
		Register markRegister = registerRepository.findById(registerDTO.getId()).orElse(new Register());

		if (markRegister.getTeacher() == null) {
			Teacher teacher = teacherService.getUser(registerDTO.getId());
			markRegister.setTeacher(teacher);
		}

		// create a new grade
		Grade grade = new Grade();
		grade.setMark(mark);
		grade.setRegister(markRegister);
		grade.setTeacher(markRegister.getTeacher());

		// Add grade to the register
		markRegister.addMarkToRegister(grade);

		// save it to the db
		registerRepository.save(markRegister);
	}

	@Transactional
	public void deleteGrade(RegisterDTO registerDTO, Grade grade) throws MarkNotFoundException {
		LOGGER.info("Removing mark from the register");
		Register markRegister = registerRepository.findById(registerDTO.getId())
				.orElseThrow(() -> new MarkNotFoundException("Mark with id " + grade.getId() + "could not be found"));

		markRegister.removeMarkFromRegister(grade);

		registerRepository.save(markRegister);
	}

	public Grade getGrade(Long id) {
		LOGGER.info("Retrieving grade {}", id);
		return gradeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Grade " + id + " does not exist"));
	}

	public Teacher getUser(long id) {
		LOGGER.info("Retrieving teacher {}", id);

		return teacherRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Teacher " + id + " does not exist"));
	}
}
