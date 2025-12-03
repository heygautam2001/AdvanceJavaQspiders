package edu.qs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.qs.Repository.EmployeeProfileRepository;
import edu.qs.Repository.EmployeeRepository;
import edu.qs.model.entity.Employee;
import edu.qs.model.entity.EmployeeProfile;
import edu.qs.model.global_custom_exception.DuplicateEmaiOrPhoneException;
import edu.qs.model.global_custom_exception.EmployeeNotFoundException;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

	@Autowired
	EmployeeProfileRepository empProfileRepo;

	@Autowired
	EmployeeRepository empRepo;

	@Override
	public boolean isEmailOrPhoneExists(String email, Long phone) {

		Employee emp = empProfileRepo.findByEmailOrPhone(email, phone);
		if (emp != null) {
			return true;
		}

		return false;
	}

	@Override
	public boolean addEmployeeProfile(Integer eId, EmployeeProfile profile) {

		if (isEmailOrPhoneExists(profile.getEmail(), profile.getPhone()) == false) {

			Optional<Employee> opt = empRepo.findById(eId);
			if (opt.isPresent()) {
				Employee emp = opt.get();
				profile.setEmployee(emp);

				EmployeeProfile newProfile = empProfileRepo.save(profile);
				if (profile.getId() != null) {
					return true;
				}
			} else {
				throw new EmployeeNotFoundException("Employee with id " + eId + " does not exists");
			}

		} else {
			throw new DuplicateEmaiOrPhoneException(
					"Email " + profile.getEmail() + " phone " + profile.getPhone() + " already exist");
		}

		return false;
	}

}
