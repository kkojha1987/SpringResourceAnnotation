package com.kanhaiya.model;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("123009")
	private int employeeId;
	@Value("Kanhaiya")
	private String employeeName;
	
    @Autowired
	private Pancard pancard;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Pancard getPancard() {
		return pancard;
	}
	@Autowired(required=false)
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
	
}
