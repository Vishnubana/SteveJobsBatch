package com.main;

public class BasicInfo extends Address {
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private Integer age;
	private long phoneNumber;
	private String bloodGroup;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public void basicMethod()
	{
	
			BasicInfo basicInfo = new BasicInfo();
			
			basicInfo.setFirstName("Vishnu Vardhan Redddy");
			System.out.println("First Name : " + basicInfo.getFirstName());
			
			basicInfo.setLastName("Bana");
			System.out.println("Last Name : " + basicInfo.getLastName());
			
			basicInfo.setGender("Male");
			System.out.println("Gender : " + basicInfo.getGender());
			
			basicInfo.setEmail("vishnuvvardhan789@gmail.com");
			System.out.println("Email Id : " + basicInfo.getEmail());
			
			basicInfo.setAge(23);
			System.out.println("Age : " + basicInfo.getAge());
			
			basicInfo.setPhoneNumber(7893862705L);
			System.out.println("Phone Number : " + basicInfo.getPhoneNumber());
			
			basicInfo.setBloodGroup("A-");
			System.out.println("Blood Group : " + basicInfo.getBloodGroup());
			}
}
	
	



