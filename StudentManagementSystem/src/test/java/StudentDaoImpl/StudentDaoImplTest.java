package StudentDaoImpl;

import static org.junit.Assert.*;


import org.junit.Ignore;
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

	@Ignore
	public void testDelStudentDao() {
		
	}

	@Ignore
	public void testUpdateStudentDao() {
		
	}

	@Ignore
	public void testGetStudentByIdDao() {
		
	}

	@Ignore
	public void testGetAllStudentsDao() {
		
	}

}
