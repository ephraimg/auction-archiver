package com.ephraimglick.auctionarchiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuctionArchiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionArchiverApplication.class, args);
		System.out.println("Spring Boot application has started successfully");
	}

}