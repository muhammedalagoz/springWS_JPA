package controller;

import model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentCont {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/add")
	public String add(ModelMap model) {
		Student student = studentService.create();
		student.setStudentName("asdasdasdasdasd");
		studentService.add(student);
		return null;
		
	}
	
}

