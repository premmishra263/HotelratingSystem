package com.lcwd.rating.RatingService;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RatingServiceApplication {

	@Autowired
	private MongoTemplate mongoTemplate;

	@PostConstruct
	public void checkDb() {
		System.out.println(">>> RATING-SERVICE DB = " + mongoTemplate.getDb().getName());
	}

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

}
