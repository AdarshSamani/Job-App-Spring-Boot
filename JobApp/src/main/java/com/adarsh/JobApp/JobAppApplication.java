package com.adarsh.JobApp;

import com.adarsh.JobApp.model.JobPost;
import com.adarsh.JobApp.repo.JobRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JobAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(JobAppApplication.class, args);

	}

}
