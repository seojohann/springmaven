package com.jsbomb.springmvc.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> classObj) {
		// TODO Auto-generated method stub
		return MemberModel.class.isAssignableFrom(classObj);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		
		if (!(obj instanceof MemberModel)) {
			errors.reject("Invalid member data");
		}
		
		MemberModel member = (MemberModel)obj;
		
		if (member.getName() == null || member.getName().trim().isEmpty()) {
			errors.rejectValue("name", "Name is not set or is empty");
		}
		
		if (member.getDob() == null || member.getDob().trim().isEmpty()) {
			errors.rejectValue("dob", "Date of birth is not set or is empty");
		}
		
		if (member.getLoginId() == null || member.getLoginId().trim().isEmpty()) {
			errors.rejectValue("loginId", "Id is not set or is empty");
		}
		
		if (member.getLoginId() != null && member.getLoginId().trim().length() < 7) {
			errors.rejectValue("loginId", "Id is too short. Use Id length at least 7 characters");
		}
		
		if (member.getPw() == null || member.getPw().trim().isEmpty()) {
			errors.rejectValue("pw", "Password is not set or is empty");
		}
		
		if (member.getPw() != null && member.getPw().trim().length() < 8) {
			errors.rejectValue("pw", "Password is too short. Use password length at least 8 characters");
		}
	}

}
