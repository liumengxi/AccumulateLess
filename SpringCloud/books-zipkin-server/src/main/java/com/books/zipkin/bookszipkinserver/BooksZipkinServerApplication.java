package com.books.zipkin.bookszipkinserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BooksZipkinServerApplication {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}


	public static void main(String[] args) {
		SpringApplication.run(BooksZipkinServerApplication.class, args);
	}

}

