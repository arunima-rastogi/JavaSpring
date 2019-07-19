package Annotations;

import org.springframework.context.annotation.Configuration;

import SpringExamples.Student;

import org.springframework.context.annotation.Bean;

@Configuration
public class StudentConfig {

	@Bean(name = "student1")
	public Student student1() {
		Student student = new Student();
		student.setId("st01");
		student.setName("student1");
		student.setAge(20);
		student.setScore(8.9);
		return student;

	}
}