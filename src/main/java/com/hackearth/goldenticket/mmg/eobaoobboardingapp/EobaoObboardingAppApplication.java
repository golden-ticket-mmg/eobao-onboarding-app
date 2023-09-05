package com.hackearth.goldenticket.mmg.eobaoobboardingapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class EobaoObboardingAppApplication {

	public static void main(String[] args) {
		log.info("Starting EobaoObboardingAppApplication ....");
		SpringApplication.run(EobaoObboardingAppApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
