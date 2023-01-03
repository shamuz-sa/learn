package com.api.learn;

import com.api.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnApplication.class, args);
	}

}
