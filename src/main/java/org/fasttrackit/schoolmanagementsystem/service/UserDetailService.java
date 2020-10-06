package org.fasttrackit.schoolmanagementsystem.service;

import java.util.Date;
import java.util.Optional;

import org.fasttrackit.helper.ConverterHelper;
import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
import org.fasttrackit.schoolmanagementsystem.dto.UserDetailDTO;
import org.fasttrackit.schoolmanagementsystem.persistence.UserDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author Kozma Ilona
 *
 */
@Service
public class UserDetailService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDetail.class);

	@Autowired
	private UserDetailRepository userRepository;

	@Autowired(required = true)
	private ConverterHelper converterHelper;

	public void setConverterHelper(ConverterHelper converterHelper) {
		this.converterHelper = converterHelper;
	}

	public UserDetail createUser(UserDetailDTO userDetailDTO) {
		LOGGER.info("Creating user {}", userDetailDTO);
		String name = userDetailDTO.getName();
		Assert.notNull(name, "You have to provide your name");

		String phoneNumber = userDetailDTO.getPhoneNumber();
		Assert.notNull(phoneNumber, "You have to provide your phone number");

		String emailAddress = userDetailDTO.getEmailAddress();
		Assert.notNull(emailAddress, "You have to provide your email address");

		String password = userDetailDTO.getPassword();
		Assert.notNull(password, "You have to provide your password");

		Date birthday = userDetailDTO.getBirthday();
		Assert.notNull(birthday, "You have to provide your birthday");

		int age = userDetailDTO.getAge();
		Assert.notNull(age, "You have to provide your age");

		if (getUserByEmail(emailAddress) == null) {
			UserDetail user = converterHelper.convertDTOToUser(userDetailDTO, 0);
			return userRepository.save(user);
		}
		return null;
	}

	/**
	 * Retrieves the user by id
	 * 
	 * @param id
	 * @return
	 */
	public UserDetailDTO getUserById(Long id) {
		LOGGER.info("Retrieving user with following {} id", id);
		UserDetail user = userRepository.findUserById(id);
		Assert.notNull(user, "No such id found in the database");
		return converterHelper.convertUserToDTO(user);
	}

	/**
	 * Retrieves the user by email
	 * 
	 * @param email
	 * @return
	 */
	public UserDetailDTO getUserByEmail(String email) {
		LOGGER.info("Retrieving user with following {} address", email);
		UserDetail user = userRepository.findByEmail(email);
		if (user != null) {
			return converterHelper.convertUserToDTO(user);
		}
		return null;
	}

	public boolean deleteUserById(Long id) {
		if (userRepository.findById(id) != null) {
			userRepository.deleteById(id);
			return true;
		}
		return false;
	}

	public UserDetailDTO updateUser(Long id, UserDetailDTO UserDetailDto) {
		Optional<UserDetail> user = userRepository.findById(id);
	}

}
