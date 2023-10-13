package com.main;

public class EmployeeInfo extends BasicInfo{
	
	private String employeeId;
	private String companyName;
	private String courseInchargeOf;
	private String skills;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCourseInchargeOf() {
		return courseInchargeOf;
	}
	public void setCourseInchargeOf(String courseInchargeOf) {
		this.courseInchargeOf = courseInchargeOf;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	private Integer role;
	
}
