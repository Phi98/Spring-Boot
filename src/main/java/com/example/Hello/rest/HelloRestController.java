package com.example.Hello.rest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloRestController {
	
	@Autowired
	@Qualifier("RegularWriter")
	TextWriter regular;
	
	@Autowired
	@Qualifier("PhiWriter")
	TextWriter PhiWriter;
	
    @GetMapping("/")
    public String HelloWorld() {
    	return regular.WriteText("Hello again");
    }
}
