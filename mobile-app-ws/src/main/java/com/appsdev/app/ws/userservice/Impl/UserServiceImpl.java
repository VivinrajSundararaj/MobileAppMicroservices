package com.appsdev.app.ws.userservice.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdev.app.ws.shared.Utils;
import com.appsdev.app.ws.ui.model.response.UserRestDetails;
import com.appsdev.app.ws.ui.model.resquest.UserDetailsRequestModel;
import com.appsdev.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

	Map<String, UserRestDetails> users;

	Utils utils;

	public UserServiceImpl() {
	}

	@Autowired
	public UserServiceImpl(Utils utils) {
		this.utils = utils;
	}

	@Override
	public UserRestDetails createUser(UserDetailsRequestModel userDetails) {
		// TODO Auto-generated method stub
		UserRestDetails returnValue = new UserRestDetails();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());

		String userId = utils.generateUserId();
		returnValue.setUserId(userId);
		if (users == null)
			users = new HashMap<>();
		users.put(userId, returnValue);
		return returnValue;
	}

}
