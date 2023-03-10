package com.sai.SpringCloudK8sMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudK8sMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudK8sMongoApplication.class, args);
	}

}
