package com.krnzft.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.util.Assert;

import com.krnzft.batch.model.Employee;

public class EmployeeImporterProcessor implements ItemProcessor<Employee, Employee> {
	
	private static final String NAME_MESSAGE = "el NOMBRE";
    private static final String LAST_NAME_MESSAGE = "los APELLIDOS";

	@Override
	public Employee process(Employee iEmployee) throws Exception {
		checkRequiredFields(iEmployee);
		return iEmployee;
	}
	
	private void checkRequiredFields(Employee employee) {
        Assert.hasLength(employee.getName(), requiredFieldError(NAME_MESSAGE, employee));
        Assert.hasLength(employee.getLastname(), requiredFieldError(LAST_NAME_MESSAGE, employee));
    }

	private String requiredFieldError(String requiredFieldText, Employee employee) {
        StringBuilder sb = new StringBuilder();
 
        sb.append(": Es necesario %s en empleado. ");
        sb.append(employee.toString());
 
        return String.format(sb.toString(), requiredFieldText);
    }
	
}
