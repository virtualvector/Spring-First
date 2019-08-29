package com.sample.socgen.SpringFirst;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:test.properties")
public class Plumber {
	String name;
	List<Engineer> enggs;
	Engineer singleEngineer;
	
	@Autowired
	List<String> injectEngg;
	
	
	
	
	public List<String> getInjectEngg() {
		return injectEngg;
	}
//
//	public void setInjectEngg(List<String> injectEngg) {
//		this.injectEngg = injectEngg;
//	}

	
	
	@Value("${userKey}")
	String user;
	
	
	public Engineer getSingleEngineer() {
		return singleEngineer;
	}

	@Autowired
	public void setSingleEngineer(Engineer singleEngineer) {
		this.singleEngineer = singleEngineer;
	}

	public String getName() {
		return name;
	}
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public List<Engineer> getEnggs() {
		return enggs;
	}
	
	
	public void setEnggs(List<Engineer> enggs) {
		this.enggs = enggs;
	}
	
	
}
