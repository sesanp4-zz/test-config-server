package com.access.testconfigserver1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestConfigServer1Application {
//	@Value("${enviroment.status}")
//    String environment;
	public static void main(String[] args) {
		SpringApplication.run(TestConfigServer1Application.class, args);
	}

	@RequestMapping(value = "/check")
	public String welcomeText() {
		return "environment";
	}

}
