package com.vastika.student.model;

public class StudentModel {
	
	private int studentId;
	private String name;
	private String age;
	private String address;
	private String email;
	
	
	
	
	
	@Override
public String toString() {
	return "StudentModel [studentId=" + studentId + ", name=" + name + ", age="
			+ age + ", address=" + address + ", email=" + email + "]";
}
	
public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	 

}
