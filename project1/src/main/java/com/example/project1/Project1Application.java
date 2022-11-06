package com.example.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		System.out.println("Hello World");
		ConfigurableApplicationContext context = run(Project1Application.class, args);
		Student s1 = context.getBean(Student.class);
		s1.show();

		Student s2 = context.getBean(Student.class);
		s2.show();
	}

}
