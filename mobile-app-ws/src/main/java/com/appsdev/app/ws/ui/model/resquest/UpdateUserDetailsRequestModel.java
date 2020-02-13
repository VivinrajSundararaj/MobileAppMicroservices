package com.appsdev.app.ws.ui.model.resquest;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

	@NotNull(message = "First Name Cannot be Null")
	@Size(min = 2, message = "First Name must not be less than 2 characters")
	private String firstName;

	@NotNull(message = "Last Name Cannot be Null")
	@Size(min = 2, message = "Last Name must not be less than 2 characters")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
