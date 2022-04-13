package com.example.Hello.rest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class IoC {
	private String message;

	public void setMessage(String message) {
	    this.message = message;
	  }

	public void getMessage() {
	    System.out.println("Print : " + message);
	  }
}
