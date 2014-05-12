package com.vastika.student.daotest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.vastika.student.dao.IStudentDao;
import com.vastika.student.dao.StudentDaoImpl;
import com.vastika.student.model.StudentModel;

public class StudentDaoImplTest {

	@Test
	public void testAddStudentDao() {
		IStudentDao studentDao = new StudentDaoImpl();		
		StudentModel student = new StudentModel();
		boolean boolStudent = studentDao.addStudentDao(student);
		assertTrue(boolStudent);			
		
	}

	@Test
	public void testDelStudentDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateStudentDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStudentByIdDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllStudentsDao() {
		fail("Not yet implemented");
	}

}
