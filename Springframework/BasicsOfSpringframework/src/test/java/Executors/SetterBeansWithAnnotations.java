package Executors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import Annotations.StudentConfig;
import SpringExamples.Student;


public class SetterBeansWithAnnotations {
	public static void main(String[] args) {
		try {
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

			Student student1 = (Student) context.getBean("student1");

			System.out.println("Student data from beans ");

			System.out.println("Id  " + student1.getId());
			System.out.println("Name" + student1.getName());
			System.out.println("Age  " + student1.getAge());
			System.out.println("Score" + student1.getScore());
			
			context.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
