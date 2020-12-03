package com.udacity.jdnd.course1exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class Course1ExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Course1ExercisesApplication.class, args);
	}


	@Bean
	public static String message()
	{
		System.out.println("THis configuration is done by Spring");
		return "Hello ,Spring";
	}

	@Bean
	public static String uppercasemessage(MessageService messageService)
	{
		System.out.println("THis is uppercasemessage");
		return messageService.uppercase();
	}
	@Bean
	public static String lowercasemessage(MessageService messageService)
	{
		System.out.println("THis is lowercasemessage");
		return messageService.uppercase();
	}
}
