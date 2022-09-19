package com.example.StudentSystem.controller;

import com.example.StudentSystem.model.Student;
import com.example.StudentSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin(origins = "http://localhost:3000/")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    get all data from the db
    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

//    build and create a student REST API
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

//    build get employee by id REST API
// Get the student information
    @GetMapping("{id}")
    public Student getStudent(@PathVariable Long id) {
    return studentRepository.findById(id).get();
}

    // Update the student information
    @PutMapping("{id}")
    public List<Student> updateStudent(@RequestBody Student student, @PathVariable Long id) {
        Student studentObj = studentRepository.findById(id).get();
        studentObj.setF_name(student.getF_name());
        studentObj.setL_name(student.getL_name());
        studentObj.setEmailId(student.getEmailId());
        studentRepository.save(studentObj);
        return studentRepository.findAll();
    }

    // Delete the student
    @DeleteMapping("{id}")
    public List<Student> deleteStudent(@PathVariable Long id) {
        studentRepository.delete(studentRepository.findById(id).get());
        return studentRepository.findAll();
    }

}
