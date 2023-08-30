package me.wanpin.springboot.controller;

import me.wanpin.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Wanpin",
                "Cai"
        );
        return student;
    }

    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Wanpin","Cai"));
        students.add(new Student(2,"Mary","Wood"));
        students.add(new Student(3,"Udemy","Java"));
        students.add(new Student(4,"Rand","Par"));
        return students;
    }

    // Spring Boot REST API with Path Variable
    // http://localhost:8080/students/1/wanpin/cai
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        return new Student(studentId,firstName,lastName);
    }

    // Spring Boot REST API with Request Param
    // http://localhost:8080/students/query?id=2&firstName=Wanpin&lastName=Cai
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }


}
