/**
 * This is a simple web app.
 * I did not use REST API here.
 * tomcat embedded server.
 * Added the dependence file of Tomcat Jasper from Maven repository.
 */

package com.fokhrul.SimpleWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppApplication.class, args);
	}

}
