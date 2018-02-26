package com.ravi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
 
 @RequestMapping("/")
 public String welcome() {
 return "Welcome Runner Dev";
 }
 
 @RequestMapping("/hello")
 public String myData() {
 return "Hello Spring Boot";
 }
}