package com.vastika.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.student.dao.StudentDaoImpl;
import com.vastika.student.model.StudentModel;


@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentDaoImpl studentDao;



	@Override
	public boolean addStudentService(StudentModel student) {		
		return studentDao.addStudentDao(student);			
	}

	@Override
	public boolean delStudentService(int id) {
		return (studentDao.delStudentDao(id));
	}

	@Override
	public StudentModel updateStudentService(StudentModel student) {
		
		return student;
	}

	@Override
	public StudentModel getStudentByIdService(int id) {		
		return studentDao.getStudentByIdDao(id);	
		
	}

	@Override
	public List<StudentModel> getAllStudentsService() {
		return studentDao.getAllStudentsDao();
		}
	

}
