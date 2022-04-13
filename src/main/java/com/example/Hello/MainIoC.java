package com.example.Hello;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.example.Hello.rest.IoC;

public class MainIoC {
	public static void main(String[] args) {

		// XmlBeanFactory factory = new XmlBeanFactory (new
		// ClassPathResource("beans.xml"));
		// HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		// obj.getMessage();

		// tạo factory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		// đọc thông tin file cấu hình và gán vào factory
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("bean.xml"));

		// tạo đối tượng từ factory
		IoC obj = (IoC) factory.getBean("IoC");
		obj.getMessage();

	}
}