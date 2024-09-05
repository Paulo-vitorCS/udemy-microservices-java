package br.com.hr_worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args);
	}

}
