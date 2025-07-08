package com.example.StudentSpringBoot.controllers;

import com.example.StudentSpringBoot.models.Students;
import com.example.StudentSpringBoot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @GetMapping("/")
    public String route(){

        return "Welcome to springBoot Security";
    }

    @GetMapping("/students")
    public List<Students> getStudents() {
        return ss.showstudents();
    }

    @GetMapping("/students/name/{name}")
    public List<Students> getStudentsByName(@PathVariable String name) {
        return ss.getStudentByname(name);
    }

    @GetMapping("/students/{id}")
    public Students getStudentById(@PathVariable int id) {
        return ss.getStudentById(id);
    }

    @PostMapping("/students")
    public String addStudent( @RequestBody Students student) {
        return ss.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Students student) {
        return ss.updatedStudent(id ,student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        return ss.deletestudent(id);
    }

}
