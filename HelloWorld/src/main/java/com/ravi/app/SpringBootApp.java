package com.ravi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.ravi.controller")
public class SpringBootApp 
{
	public static void main(String[] args) 
    {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
