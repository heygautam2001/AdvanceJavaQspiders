package edu.qs.service;

import edu.qs.model.entity.EmployeeProfile;

public interface EmployeeProfileService {
	
	public boolean isEmailOrPhoneExists(String email , Long Phone);
	public boolean addEmployeeProfile(Integer eId, EmployeeProfile profile);
	
	

}
