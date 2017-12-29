package com.xianlei.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xianlei.boot.service.HelloService;

//@RestController
//@SpringBootApplication
public class ApplicationCustomer {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/")
	public String index(){
		return helloService.sayHello();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationCustomer.class, args);
	}

}
