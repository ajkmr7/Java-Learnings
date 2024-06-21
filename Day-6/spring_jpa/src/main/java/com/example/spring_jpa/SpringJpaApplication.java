package com.example.spring_jpa;

import com.example.spring_jpa.model.Student;
import com.example.spring_jpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRegisterNo(15);
		s1.setName("Ajay Kumar");
		s1.setMarks(88);

		s2.setRegisterNo(8);
		s2.setName("Abrar Hasan");
		s2.setMarks(88);

		s3.setRegisterNo(1);
		s3.setName("Aadhavan");
		s3.setMarks(78);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);

		System.out.println(repo.findById(15).orElse(new Student()));
		System.out.println(repo.findByName("Ajay Kumar"));
		System.out.println(repo.findByMarksGreaterThan(87));

		repo.delete(s2);
	}

}
