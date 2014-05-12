package com.vastika.student.dao;

import java.util.List;

import com.vastika.student.model.StudentModel;

public interface IStudentDao {
	

	public boolean addStudentDao (StudentModel student);
	
	public boolean delStudentDao (int id);
	
	public StudentModel updateStudentDao (StudentModel student);
	
	public StudentModel getStudentByIdDao (int id);
	 
	public List<StudentModel> getAllStudentsDao();
	

}
