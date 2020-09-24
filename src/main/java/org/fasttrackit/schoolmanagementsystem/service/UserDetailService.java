package org.fasttrackit.schoolmanagementsystem.service;

import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
import org.fasttrackit.schoolmanagementsystem.persistence.UserDetailRepository;
import org.fasttrackit.schoolmanagementsystem.transfer.SaveUserDetailRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDetail.class);
	private final UserDetailRepository userDetailRepository;

	@Autowired
	public UserDetailService(UserDetailRepository userDetailRepository) {
		this.userDetailRepository = userDetailRepository;
	}

	public UserDetail createUser(SaveUserDetailRequest request) {

		LOGGER.info("Creating user {}", request);
		UserDetail userDetail = new UserDetail();
//		userDetail.setRole(request.getRole());
		userDetail.setName(request.getName());
		userDetail.setAge(request.getAge());
		userDetail.setBirthday(request.getBirthday());
		userDetail.setEmailAddress(request.getEmailAddress());
		userDetail.setPhoneNumber(request.getPhoneNumber());
		userDetail.setRegistrationNumber(request.getRegistrationNumber());
//		userDetail.setSubjectInfo(request.getSubjectInfo());

		return userDetailRepository.save(userDetail);
	}

	public UserDetail getUserById(long id) {
		LOGGER.info("Retrieving user {}", id);

		return userDetailRepository.findUserById(id);
//				.orElseThrow(() -> new ResourceNotFoundException("User " + id + " not found."));
	}

	public UserDetail getUserByEmail(String email) {
		LOGGER.info("Retrieving user {}", email);

		return userDetailRepository.findByEmail(email);
	}

//	public UserDetail updateUser(long id, UserDetailService request) {
////		String first = .getText( );
////		String last = textLastName.getText( );
////		String job = textJobTitle.getText( );
////		String ID = textID.getText( );
////
////		return userDetailRepository.findByEmail(long);
}
