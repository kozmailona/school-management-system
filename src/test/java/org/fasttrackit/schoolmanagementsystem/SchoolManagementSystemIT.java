//package org.fasttrackit.schoolmanagementsystem;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.greaterThan;
//import static org.hamcrest.Matchers.is;
//import static org.hamcrest.Matchers.notNullValue;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.fasttrackit.schoolmanagementsystem.domain.SubjectInfo;
//import org.fasttrackit.schoolmanagementsystem.domain.SubjectName;
//import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
//import org.fasttrackit.schoolmanagementsystem.domain.UserRole;
//import org.fasttrackit.schoolmanagementsystem.dto.UserDetailDTO;
//import org.fasttrackit.schoolmanagementsystem.helper.ConverterHelper;
//import org.fasttrackit.schoolmanagementsystem.persistence.UserDetailRepository;
//import org.fasttrackit.schoolmanagementsystem.service.UserDetailService;
//import org.joda.time.DateMidnight;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class SchoolManagementSystemIT {
//
//	private static final String PHONE_NUMBER = "0754764761";
//
//	private static final String EMAIL_ADDRESS = "kozmailona12@gmail.com";
//
//	private static final Date BIRTHDAY_DATE = new DateMidnight(2007, 2, 2).toDate();
//
//	@Resource
//	private UserDetailRepository userRepository;
//
//	@Resource
//	private ConverterHelper converterHelper;
//
//	@Resource
//	private UserDetailService userDetailService;
//
//	@Test
//	public void createUserDetail_whenValidRequest_thenReturnCreatedUserDetail() {
//
//		UserDetailDTO user = new UserDetailDTO();
//		user.setName("Student");
//		user.setPassword("password");
//		user.setAge(16);
//		user.setRole(UserRole.TEACHER);
//		user.setPhoneNumber(PHONE_NUMBER);
//		user.setBirthday(BIRTHDAY_DATE);
//		user.setEmailAddress(EMAIL_ADDRESS);
//
//		// Create the first object of subjectInfo + set up its values
//		SubjectInfo english = new SubjectInfo();
//		english.setSubjectName(SubjectName.ENGLISH);
//
//		// Create the second object of subjectInfo + set up its values
//		SubjectInfo biology = new SubjectInfo();
//		biology.setSubjectName(SubjectName.BIOLOGY);
//
//		// Declare the list of subjectInfo
//		List<SubjectInfo> subjects = new ArrayList<>();
//
//		// Add the previously created subjectInfos to the subjectsList
//		subjects.add(english);
//		subjects.add(biology);
//
//		// Set subjectInfo to the request
//		user.setSubjectInfo(subjects);
//
//		UserDetail userDetail = userDetailService.createUser(user);
//
//		assertThat(userDetail, notNullValue());
//		assertThat(userDetail.getId(), greaterThan(0L));
//		assertThat(userDetail.getName(), is(user.getName()));
//		assertThat(userDetail.getAge(), is(user.getAge()));
//
//	}
//
//}
