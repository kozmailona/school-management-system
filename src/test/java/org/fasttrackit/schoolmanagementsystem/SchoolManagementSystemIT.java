package org.fasttrackit.schoolmanagementsystem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.fasttrackit.schoolmanagementsystem.domain.SubjectInfo;
import org.fasttrackit.schoolmanagementsystem.domain.SubjectName;
import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
import org.fasttrackit.schoolmanagementsystem.service.UserDetailService;
import org.fasttrackit.schoolmanagementsystem.transfer.user.SaveUserDetailRequest;
import org.joda.time.DateMidnight;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SchoolManagementSystemIT {

	private static final String PHONE_NUMBER = "0754764761";
	private static final String EMAIL_ADDRESS = "kozmailona12@gmail.com";
	private static final Date BIRTHDAY_DATE = new DateMidnight(2007, 2, 2).toDate();

	@Resource
	private UserDetailService userDetailService;

	@Test
	public void createUserDetail_whenValidRequest_thenReturnCreatedUserDetail() {

		SaveUserDetailRequest request = new SaveUserDetailRequest();
		request.setName("Student");
		request.setAge(16);
		request.setGender("female");
		request.setPhoneNumber(PHONE_NUMBER);
		request.setBirthday(BIRTHDAY_DATE);
		request.setEmailAddress(EMAIL_ADDRESS);

		// Create the first object of subjectInfo + set up its values
		SubjectInfo english = new SubjectInfo();
		english.setSubjectID(1);
		english.setSubjectName(SubjectName.ENGLISH);

		// Create the second object of subjectInfo + set up its values
		SubjectInfo biology = new SubjectInfo();
		biology.setSubjectID(2);
		biology.setSubjectName(SubjectName.BIOLOGY);

		// Declare the list of subjectInfo
		List<SubjectInfo> subjects = new ArrayList<>();

		// Add the previously created subjectInfos to the subjectsList
		subjects.add(english);
		subjects.add(biology);

		// Set subjectInfo to the request
		request.setSubjectInfo(subjects);

		UserDetail userDetail = userDetailService.createUser(request);

		assertThat(userDetail, notNullValue());
		assertThat(userDetail.getId(), greaterThan(0L));
		assertThat(userDetail.getName(), is(request.getName()));
		assertThat(userDetail.getAge(), is(request.getAge()));

	}

}
