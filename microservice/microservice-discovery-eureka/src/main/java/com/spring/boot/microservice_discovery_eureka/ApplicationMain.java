package com.spring.boot.microservice_discovery_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka for server discovery
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationMain {
	
	public static void main(String[] args){
		SpringApplication.run(ApplicationMain.class, args);
	}

}
