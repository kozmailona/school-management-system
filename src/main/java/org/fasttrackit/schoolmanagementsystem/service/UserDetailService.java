package org.fasttrackit.schoolmanagementsystem.service;

import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
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

	public UserDetail createUser(UserDetail userDetail) {
		LOGGER.info("Creating user {}", userDetail);
		String firstName = userDetail.getFirstName();
		Assert.notNull(firstName, "You have to provide your first name");

		String lastName = userDetail.getLastName();
		Assert.notNull(lastName, "You have to provide your last name");

		String phoneNumber = userDetail.getPhoneNumber();
		Assert.notNull(phoneNumber, "You have to provide your phone number");

		String emailAddress = userDetail.getEmail();
		Assert.notNull(emailAddress, "You have to provide your email address");

		String password = userDetail.getPassword();
		Assert.notNull(password, "You have to provide your password");

		String userName = userDetail.getUserName();
		Assert.notNull(userName, "No username was provided");

		if (getUserByEmail(emailAddress) == null) {
			UserDetail user = new UserDetail() {
			};
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
	public UserDetail getUserById(Long id) {
		LOGGER.info("Retrieving user with following {} id", id);
		UserDetail user = userRepository.findUserById(id);
		Assert.notNull(user, "No such id found in the database");
		return (user);
	}

	/**
	 * Retrieves the user by email
	 * 
	 * @param email
	 * @return
	 */
	public UserDetail getUserByEmail(String email) {
		LOGGER.info("Retrieving user with following {} address", email);
		UserDetail user = userRepository.findUserByEmailAddress(email);
		if (user != null) {
			return (user);
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

	public UserDetail updateUser(Long id, UserDetail userDetail) {

		// Username cannot be updated
		UserDetail user = userRepository.findUserById(id);
		user.setId(userDetail.getId());
		user.setFirstName(userDetail.getFirstName());
		user.setLastName(userDetail.getLastName());
		user.setPhoneNumber(userDetail.getPhoneNumber());
		user.setEmail(userDetail.getEmail());
		user.setPassword(userDetail.getPassword());

		UserDetail savedUser = userRepository.save(user);
		return (savedUser);

	}

}
