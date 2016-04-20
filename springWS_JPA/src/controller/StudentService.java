package controller;

import java.util.List;

import model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student create(){

		Student student = new Student();
		return student;
	}
	
	public Student add(Student task) {
		return studentRepo.saveAndFlush(task);
	}
	
	public List<Student> findAll() {
		return studentRepo.findAll();
	}
}
