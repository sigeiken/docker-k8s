package com.kentec.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class K8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sApplication.class, args);
		System.out.println("---------------------------K8s App started.....---------------------------");
	}

}
