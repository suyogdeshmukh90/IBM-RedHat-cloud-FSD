package org.demo.spring_hibernate_javabased.service;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.demo.spring_hibernate_javabased.dao.EmployeeDao;
import org.demo.spring_hibernate_javabased.dto.EmployeeDto;
import org.demo.spring_hibernate_javabased.ui.EmployeeRequestModel;
import org.demo.spring_hibernate_javabased.ui.EmployeeResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDaoImpl;
	private ModelMapper modelMapper;
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDaoImpl, ModelMapper modelMapper) {
		
		this.employeeDaoImpl = employeeDaoImpl;
		this.modelMapper = modelMapper;
	}

	@Override
	public EmployeeResponseModel createEmployee(EmployeeRequestModel employeeDetails) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeDto dto=modelMapper.map(employeeDetails, EmployeeDto.class);
		dto.setEmployeeId(UUID.randomUUID().toString());
		return employeeDaoImpl.createEmployee(dto);
	}

	@Override
	public List<EmployeeResponseModel> displayAllEmployees() {
		

		return employeeDaoImpl.displayAllEmployees();
	}

	@Override
	public EmployeeResponseModel findEmployeeById(String employeeId) {
		
		return employeeDaoImpl.findEmployeeById(employeeId);
	}

	@Override
	public EmployeeResponseModel updateEmployee(String employeeId) throws IOException {
		
		return employeeDaoImpl.updateEmployee(employeeId);
	}

	@Override
	public void deleteEmployee(String employeeId) {
		employeeDaoImpl.deleteEmployee(employeeId);
		
	}

}
