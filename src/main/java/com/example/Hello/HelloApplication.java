package com.example.Hello;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import com.example.Hello.rest.IoC;

@SpringBootApplication
public class HelloApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
