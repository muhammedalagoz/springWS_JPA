package controller;

import java.util.List;

import model.Person;
import model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/getPerson")
	@ResponseBody
	public Person getStudent() {
		return new Person ("1","Levent","Erguder","1989");
	}
	
	@RequestMapping("/getPersonList")
	@ResponseBody
	public List<Student> getPersonList() {
//		Person person1 = new Person("1", "Levent", "Erguder", "1989");
//		Person person2 = new Person("2", "James", "Gosling", "190000");
//		Person person3 = new Person("3", "Joshua", "Bloch", "1961");
//
//		List<Person> personList = new ArrayList<Person>();
//		personList.add(person1);
//		personList.add(person2);
//		personList.add(person3);

		Student student = studentService.create();
		student.setStudentName("asdasdasdasdasd");
		studentService.add(student);
		
		
		
		return studentService.findAll();
	}
	
	
	
	
	
}
