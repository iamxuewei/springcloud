package com.example.springcloudconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumeApplication.class, args);
	}
}
