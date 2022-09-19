package com.example.StudentSystem;

import com.example.StudentSystem.model.Student;
import com.example.StudentSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(StudentSystemApplication.class, args);}

	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception{
//		Student student = new Student();
//		student.setF_name("Dhyey");
//		student.setL_name("Rabadiya");
//		student.setEmailId("dhyey@gmail.com");
//		studentRepository.save(student);
//
//		Student student1 = new Student();
//		student1.setF_name("Yash");
//		student1.setL_name("Shah");
//		student1.setEmailId("yash@gmail.com");
//		studentRepository.save(student1);
	}
}
