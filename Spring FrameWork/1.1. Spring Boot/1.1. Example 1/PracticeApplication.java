package com.fokhrul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beans = SpringApplication.run(PracticeApplication.class, args);
		
		/**
		 * objects are created inside the Spring container and they are called Spring Beans.
		 * Alien.class is the type of objects of Alien class
		 */
		Alien obj = beans.getBean(Alien.class);
		obj.show();
		
		Alien obj1 = beans.getBean(Alien.class);
	
	}

}
