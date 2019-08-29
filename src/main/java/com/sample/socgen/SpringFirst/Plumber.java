package com.sample.socgen.SpringFirst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class Plumber {
	String name;
	List<Engineer> enggs;
	Engineer singleEngineer;
	
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
