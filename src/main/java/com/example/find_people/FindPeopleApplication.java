package com.example.find_people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FindPeopleApplication {

    public static void main(String[] args) {

        SpringApplication.run(FindPeopleApplication.class, args);

    }

}
