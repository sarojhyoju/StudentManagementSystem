package com.vastika.student.services;

import java.util.List;

import com.vastika.student.model.StudentModel;

public interface IStudentService {
	
	public boolean addStudentService (StudentModel student);
	
	public boolean delStudentService (int id);
	
	public StudentModel updateStudentService (StudentModel student);
	
	public StudentModel getStudentByIdService (int id);
	 
	public List<StudentModel> getAllStudentsService();
	
	

}
