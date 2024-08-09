package com.chuchulev.Spring_Data_Redis;

import jakarta.persistence.Cacheable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringDataRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisApplication.class, args);
	}

}
