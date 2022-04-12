package com.example.Hello.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PhiWriter")
public class PhiWriter implements TextWriter {

	public String WriteText(String s) {
		return s + "Phi writer 2" ;
	}

}
