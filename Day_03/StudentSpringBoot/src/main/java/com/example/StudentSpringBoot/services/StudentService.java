package com.example.StudentSpringBoot.services;

import com.example.StudentSpringBoot.models.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Students> s = new ArrayList<>(
           Arrays.asList(new Students("Pooja" , 99 , "23AD099" , "pooja@gmail.com"),
                         new Students("Poorrnisha" , 100 , "23AD100" , "poorrnisha@gmail.com"))
    );

    public String showstudents(){
        return s.toString();
    }
    public String addStudent(){
        s.add(new Students("John" , 101 , "23AD101" , "john@gmail.com"));
        return s.toString();
    }

    public String updatedStudent(){
        return "This is updateStudent method";
    }

    public String deletestudent() {
        return "This is deletestudent method";
    }
}
