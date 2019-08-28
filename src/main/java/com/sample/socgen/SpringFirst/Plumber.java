package com.sample.socgen.SpringFirst;

import java.util.List;

public class Plumber {
	String name;
	List<Engineer> enggs;
	public String getName() {
		return name;
	}
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
