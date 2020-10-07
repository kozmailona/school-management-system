package org.fasttrackit.helper;

import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
import org.fasttrackit.schoolmanagementsystem.dto.UserDetailDTO;
import org.fasttrackit.schoolmanagementsystem.persistence.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ConverterHelper {

	@Autowired
	private UserDetailRepository userRepository;

	public UserDetail convertDTOToUser(UserDetailDTO userDetailsDTO, long id) {
		UserDetail user = userRepository.findUserById(id);
		if (user == null) {
			user = new UserDetail();
		}
		user.setId(userDetailsDTO.getId());
		user.setName(userDetailsDTO.getName());
		user.setPhoneNumber(userDetailsDTO.getPhoneNumber());
		user.setEmailAddress(userDetailsDTO.getEmailAddress());
		user.setPassword(userDetailsDTO.getPassword());
		user.setBirthday(userDetailsDTO.getBirthday());
		user.setAge(userDetailsDTO.getAge());
		return user;
	}

	public UserDetailDTO convertUserToDTO(UserDetail userDetail) {
		UserDetailDTO userDetailDTO = new UserDetailDTO();
		userDetailDTO.setName(userDetail.getName());
		userDetailDTO.setAge(userDetail.getAge());
		userDetailDTO.setPhoneNumber(userDetail.getPhoneNumber());
		userDetailDTO.setEmailAddress(userDetail.getEmailAddress());
		userDetailDTO.setPassword(userDetail.getPassword());
		userDetailDTO.setBirthday(userDetail.getBirthday());
		return userDetailDTO;
	}

}
