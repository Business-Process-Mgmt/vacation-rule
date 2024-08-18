package com.camunda.connectors;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class CamundaOutOfOfficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaOutOfOfficeApplication.class, args);
	}

}
