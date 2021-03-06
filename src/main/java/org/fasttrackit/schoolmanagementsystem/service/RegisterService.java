package org.fasttrackit.schoolmanagementsystem.service;

import java.util.List;

import org.fasttrackit.schoolmanagementsystem.domain.Grade;
import org.fasttrackit.schoolmanagementsystem.domain.Register;
import org.fasttrackit.schoolmanagementsystem.domain.Teacher;
import org.fasttrackit.schoolmanagementsystem.dto.RegisterDTO;
import org.fasttrackit.schoolmanagementsystem.exception.EmptyRegisterException;
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

    private final TeacherService teacherService;

    @Autowired
    public RegisterService(RegisterRepository registerRepository, TeacherService teacherService) {
        this.registerRepository = registerRepository;
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

    @Transactional
    public List<Grade> findAllGradesByStudent(String userName) throws EmptyRegisterException {
        LOGGER.info("Retrieving all marks for user {} from the register", userName);

        List<Grade> grades = registerRepository.findAllGradesByStudent(userName);
        if (grades.isEmpty()) {
            throw new EmptyRegisterException("The register for " + userName + " is empty");
        }
        return grades;
    }

    //    @Transactional
    //    public Grade updateGradeForStudent(Grade grade) throws EmptyRegisterException {
    //        LOGGER.info("Retrieving all marks for user {} from the register", userName);
    //
    //        Assert.notNull(grade, "Invalid grade reference");
    //        getCurrentSession().saveOrUpdate(grade);
    //        notifySaveOrUpdateListeners(grade);
    //
    //        //retrieve all marks for a student
    //        List<Grade> grades = registerRepository.findAllGradesByStudent(userName);
    //
    //        //If the student does not have grades throw an exception
    //        if (grades.isEmpty()) {
    //            throw new EmptyRegisterException("The register for " + userName + " is empty");
    //        }
    //
    //        grades.stream().filter(subjectName.equals(grades.get(0).getRegister().getSubjectInfos().get(0).getSubjectName()))
    //    }

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
