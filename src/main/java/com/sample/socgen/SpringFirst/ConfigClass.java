package com.sample.socgen.SpringFirst;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.properties")
public class ConfigClass {
	
	@Value("${userKeyName}")
	String keyUserName;
	
	@Value("${userKeyBalance}")
	int keyUserBal;
	
	@Value("${userKeyName2}")
	String keyUserName2;
	
	@Value("${userKeyBalance2}")
	int keyUserBal2;
	
	@Value("${userKeyName3}")
	String keyUserName3;
	
	@Value("${userKeyBalance3}")
	int keyUserBal3;
	
	
	
	
	@Bean
	public int userId(){
		return keyUserBal;
	}
	
	@Bean
	public String userName(){
		return keyUserName;
	}
	
	@Bean
	public Engineer newEngg(){
		return new Engineer(keyUserName,keyUserBal);
	}
	
	@Bean
	public Engineer newEngg1(){
		return new Engineer(keyUserName2,keyUserBal2);
	}
	
	@Bean
	public Engineer newEngg2(){
		return new Engineer(keyUserName3,keyUserBal3);
	}
	
	@Bean
	public String name() {
		return "rajiv";
	}
	
	@Bean
	public Plumber myPlumber() {
		return new Plumber();
	}
	
	
}
