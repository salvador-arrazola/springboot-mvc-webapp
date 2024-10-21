package com.sarrazola.learning.springboot.mvc.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
// import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
// We can include multiple properties files, organized by modules or categories, inside the
// "resources" folder:
// @PropertySources({
//   @PropertySource("classpath:values.properties"),
//   @PropertySource("classpath:values2.properties")
// })
@PropertySource("classpath:values.properties")
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

}
