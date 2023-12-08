package com.employees.api;

import com.employees.api.Models.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		Car car1 = new Car("Toyota",2001,50988.0 ,true);
		Car car2 = new Car("BMW",2016, 3906507.0 , false);

		car1.displayInfo();
		System.out.println("..........");
		car2.displayInfo();





	}



}
