package com.example.spring_jdbc;

import com.example.spring_jdbc.model.Student;
import com.example.spring_jdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student student = context.getBean(Student.class);
        student.setRegisterNo(2);
        student.setName("Aarthi");
        student.setMarks(86);

        StudentService service = context.getBean(StudentService.class);

        service.addStudent(student);

        List<Student> students = service.getStudents();
        System.out.println(students);
    }

}
