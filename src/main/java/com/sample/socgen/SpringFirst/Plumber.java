package com.sample.socgen.SpringFirst;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.List;



public class Plumber {
	
	@Autowired
	String name;

	@Autowired(required = false)
	List<Engineer> newEngg;
	

	
//
//	public Engineer getNewEngg() {
//		return newEngg;
//	}
//
//	public void setNewEngg(Engineer newEngg) {
//		this.newEngg = newEngg;
//	}
//
//	public String getName() {
//		return name;
//	}

	
	public List<Engineer> getNewEngg() {
		return newEngg;
	}



	public void setNewEngg(List<Engineer> newEngg) {
		this.newEngg = newEngg;
	}



	public void setName(String name) {
		this.name = name;
	}

}
