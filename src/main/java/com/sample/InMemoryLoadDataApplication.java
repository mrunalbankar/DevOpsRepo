package com.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.model.Student;
import com.sample.repository.StudentRepository;
import com.sample.service.StudentService;

@SpringBootApplication
public class InMemoryLoadDataApplication implements CommandLineRunner {
	
	@Autowired
	StudentService studentService;
	
	public static void main(String[] args) {
		SpringApplication.run(InMemoryLoadDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student  st =  new Student();
		st.setId(1);
		st.setName("Mrunal");
		st.setAge(31);
		st.setEmail("mrunal95955@gmail.com");
		//studentService.saveOrUpdate(st);
		
		System.out.println(studentService.getAllStudent());
		
		//studentService.delete(2);
		List<Student> stu =  studentService.getAllStudent();
		
		for (Student student : stu) {
			System.out.println(student.getName());
		}
		
	}

}
