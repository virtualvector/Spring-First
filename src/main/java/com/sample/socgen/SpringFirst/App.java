package com.sample.socgen.SpringFirst;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Engineer engineer = context.getBean("myEngineer",Engineer.class);
       System.out.println(engineer.getUserName()+Integer.toString(engineer.getUserId()));
    }
}
