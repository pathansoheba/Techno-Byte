package com.technobyte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.technobyte"})
public class TechnoByteApplication {

  public static void main(String[] args) {
    SpringApplication.run(TechnoByteApplication.class, args);
  }
}
