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
			System.out.println("Invalid member data");
			errors.reject("Invalid member data");
		}
		
		MemberModel member = (MemberModel)obj;
		
		if (member.getName() == null || member.getName().trim().isEmpty()) {
			System.out.println("Name is not set or is empty");
			errors.rejectValue("name", "Name is not set or is empty");
		}
		
		if (member.getDob() == null || member.getDob().trim().isEmpty()) {
			System.out.println("Date of birth is not set or is empty");
			errors.rejectValue("dob", "Date of birth is not set or is empty");
		}
		
		if (member.getLoginId() == null || member.getLoginId().trim().isEmpty()) {
			System.out.println("Id is not set or is empty");
			errors.rejectValue("loginId", "Id is not set or is empty");
		}
		
		if (member.getLoginId() != null && member.getLoginId().trim().length() < 7) {
			System.out.println("Id is too short. Use Id length at least 7 characters");
			errors.rejectValue("loginId", "Id is too short. Use Id length at least 7 characters");
		}
		
		if (member.getPw() == null || member.getPw().trim().isEmpty()) {
			System.out.println("Password is not set or is empty");
			errors.rejectValue("pw", "Password is not set or is empty");
		}
		
		if (member.getPw() != null && member.getPw().trim().length() < 8) {
			System.out.println("Password is too short. Use password length at least 8 characters");
			errors.rejectValue("pw", "Password is too short. Use password length at least 8 characters");
		}
	}

}
