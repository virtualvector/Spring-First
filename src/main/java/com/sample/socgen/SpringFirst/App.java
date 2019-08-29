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

@Configuration
public class App {
	
	@Bean
	public List<String> injectEngg(){
		return Arrays.asList("a","b");
	}
	
	public static void main(String[] args) {
		
	//new App().injectEngg();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		Engineer engineer = context.getBean("myEngineer", Engineer.class);
//		System.out.println(engineer.getUserName() + Integer.toString(engineer.getUserId() ));
//		
		Plumber plum = context.getBean("myPlumber",Plumber.class);
		//System.out.println(plum.getName()+" "+plum.getEngg().getUserName() + " " + plum.getEngg().getUserId());
		
		for(Engineer eng: plum.getEnggs() ) {
			System.out.println(eng.getUserName()+" "+eng.getUserId());
		}
		
		System.out.println(plum.getSingleEngineer().getUserName());
		System.out.println(plum.getInjectEngg().get(0));
	}
}
