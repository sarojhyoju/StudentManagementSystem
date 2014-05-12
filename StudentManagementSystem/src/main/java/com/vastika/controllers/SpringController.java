package com.vastika.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vastika.student.model.StudentModel;
import com.vastika.student.services.StudentServiceImpl;

@Controller
@RequestMapping("/students/*")
public class SpringController {

	@Autowired
	private StudentServiceImpl studentService;

	@Autowired
	private StudentModel student;

	@RequestMapping(value = "/students/addstud", method = RequestMethod.POST)
	public String addStudent(@RequestParam(value = "name") String name,
			@RequestParam(value = "age") String age,
			@RequestParam(value = "address") String address,
			@RequestParam(value = "email") String email) {

		student.setName(name);
		student.setAge(age);
		student.setAddress(address);
		student.setEmail(email);

		if (studentService.addStudentService(student)) {

			return "addStudent";

		}
		return "Student is not added to the database";

	}

	@RequestMapping(value = "/students/delstud", method = RequestMethod.POST)
	public String delStudent(@RequestParam(value = "id") int id) {
		if (studentService.delStudentService(id)) {
			return "Student is deleted from the database";
		}

		return "Student can not be deleted from the database";
	}

	@RequestMapping(value = "/getstudents", method = RequestMethod.GET)
	ModelAndView getAllStudents() {

		List<StudentModel> studentList = studentService.getAllStudentsService();
		ModelAndView mv = new ModelAndView("showStudents", "students",
				studentList); // viewname, variable, customer
		return mv;
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	ModelAndView getStudentById(@PathVariable int id) {
		student = studentService.getStudentByIdService(id);
		ModelAndView mv = new ModelAndView("showStudent", "student",
				student.toString());
		return mv;
	}

}
