package com.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//something from others
		int a=10;
		int b=200;
		int c=500;
		
	}

}
