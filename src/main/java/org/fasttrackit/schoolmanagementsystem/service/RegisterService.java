package org.fasttrackit.schoolmanagementsystem.service;

import org.fasttrackit.schoolmanagementsystem.domain.Grade;
import org.fasttrackit.schoolmanagementsystem.domain.Register;
import org.fasttrackit.schoolmanagementsystem.domain.Teacher;
import org.fasttrackit.schoolmanagementsystem.dto.RegisterDTO;
import org.fasttrackit.schoolmanagementsystem.persistence.RegisterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegisterService.class);

	private final RegisterRepository registerRepository;

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
	public void addGrade(RegisterDTO registerDTO) {
		LOGGER.info("Adding mark to the register");
		Register markRegister = registerRepository.findById(registerDTO.getId()).orElse(new Register());

		if (markRegister.getTeacher() == null) {
			Teacher teacher = teacherService.getUser(registerDTO.getId());
			markRegister.setTeacher(teacher);
		}

		Grade grade = gradeService.getGrade(registerDTO.getId());
		markRegister.addMarkToRegister(grade);

		registerRepository.save(markRegister);
	}

	@Transactional
	public void deleteGrade(RegisterDTO registerDTO) {
		LOGGER.info("Removing mark from the register");
		Register markRegister = registerRepository.findById(registerDTO.getId()).orElse(new Register());

		if (markRegister.getTeacher() == null) {
			Teacher teacher = teacherService.getUser(registerDTO.getId());
			markRegister.setTeacher(teacher);
		}

		Grade grade = gradeService.getGrade(registerDTO.getId());
		markRegister.removeMarkFromRegister(grade);

		registerRepository.save(markRegister);
	}
}
