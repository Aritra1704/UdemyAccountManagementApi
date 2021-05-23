package io.arpaul.UdemyAccountManagementApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UdemyAccountManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyAccountManagementApiApplication.class, args);
	}

}
