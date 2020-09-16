package org.fasttrackit.schoolmanagementsystem;

import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
import org.fasttrackit.schoolmanagementsystem.service.UserDetailService;
import org.fasttrackit.schoolmanagementsystem.transfer.SaveUserDetailRequest;
import org.joda.time.DateMidnight;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

        UserDetail userDetail = userDetailService.createUser(request);

        assertThat(userDetail, notNullValue());
        assertThat(userDetail.getId(), greaterThan(0L));
        assertThat(userDetail.getName(), is(request.getName()));
        assertThat(userDetail.getGender(), is(request.getGender()));
        assertThat(userDetail.getAge(), is(request.getAge()));

    }

}
