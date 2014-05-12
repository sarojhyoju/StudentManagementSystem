package com.vastika.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vastika.student.model.StudentModel;

public class StudentDaoImpl implements IStudentDao{
	Connection con = null;
	
	@Autowired
	private StudentModel student;

	@Override
	public boolean addStudentDao(StudentModel student) {
		
		PreparedStatement ps = null;		
		String sql = "insert into student (name, age, email, address) values(?,?,?,?)";
		con = DbConnection.dbConnection();
		try {
			
			
			ps=con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getAge());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getAddress());
			ps.executeUpdate();
			return true;	
			
		} catch (SQLException e) {
			System.out.println("Could not insert data into the database");
			e.printStackTrace();
			}
		finally{
			try {
				ps.clearParameters();
			} catch (SQLException e) {
				System.out.println("Could not clear PreparedStatement's parmeters");
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Could not close connection");
				e.printStackTrace();
			}
			
		}
		
			return false;	
		
	}

	@Override
	public boolean delStudentDao(int id) {
		PreparedStatement ps = null;
		String sql = "DELETE FROM student WHERE studentId=?";
		con=DbConnection.dbConnection();
		
		try {
			
			ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			boolean condition = ps.execute();
			return condition;
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not delete Student from the database");
		}	
		
		return false;
	}

	@Override
	public StudentModel updateStudentDao(StudentModel student) {
	PreparedStatement ps = null;
		/*String query = "update student set studentId=?, name=?, age=?, address= ? , email=? where "*/
	return student;
	}

	@Override
	public StudentModel getStudentByIdDao(int id) {
		ResultSet rs = null;
		PreparedStatement ps = null;
		String query = "select * from student where studentId=?";
		con = DbConnection.dbConnection();
		
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
				StudentModel student = new StudentModel();
				student.setStudentId(rs.getInt("studentId"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getString("age"));
				student.setAddress(rs.getString("address"));
				student.setEmail(rs.getString("email"));
				return student;			
				
			}					
			
		} catch (SQLException e) {
			System.out.println("Student can not retrieved by ID");
			e.printStackTrace();
		}
		return null;
		}

	@Override
	public List<StudentModel> getAllStudentsDao() {
		
		
		List<StudentModel> studentList = new ArrayList<StudentModel>();	
		PreparedStatement ps = null; 
		ResultSet rs = null;
		String sql = "select * from student";		
		
	
		con = DbConnection.dbConnection();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				StudentModel student = new StudentModel();
				student.setStudentId(rs.getInt("studentId"));
				student.setName(rs.getString("name"));;
				student.setAge(rs.getString("age"));
				student.setAddress(rs.getString("address"));
				student.setEmail(rs.getString("email"));
				studentList.add(student);
			}
		} catch (SQLException e) {
			System.out.println("Could not retrieve StudentList from the database");
			e.printStackTrace();
		}
			
		finally{
			try {
				ps.clearParameters();
			} catch (SQLException e) {
				System.out.println("Could not clear PreparedStatement's parmeters");
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Could not close connection");
				e.printStackTrace();
			}
			
		}
		return studentList;	
	}
	

}
