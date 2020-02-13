package com.appsdev.app.ws.userservice;

import com.appsdev.app.ws.ui.model.response.UserRestDetails;
import com.appsdev.app.ws.ui.model.resquest.UserDetailsRequestModel;

public interface UserService {
	UserRestDetails createUser(UserDetailsRequestModel userDetails);
}
