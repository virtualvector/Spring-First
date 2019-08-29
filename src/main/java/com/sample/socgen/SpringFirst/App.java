package com.sample.socgen.SpringFirst;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */


public class App {
	
	
	
	public static void main(String[] args) {
		
	
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Plumber plum = context.getBean("myPlumber",Plumber.class);
		
		
		for(Engineer engg: plum.getNewEngg()) {
			System.out.println(engg.getUserName() +  " " + engg.getUserId());
		}
		
	
			
		
		
		//System.out.println(plum.getNewEngg().getUserName() + " " +plum.getNewEngg().getUserId());
	}
}
