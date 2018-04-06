package com.songguangyu.MicroserviceLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceLabApplication.class, args);
		System.out.print("Started!");
	}
}
