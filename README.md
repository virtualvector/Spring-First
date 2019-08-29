# Sring Project With Notes

Spring works on IOC(Inversion of control) and DI (Dependency Injection)

1. create a new maven project (select maven-quick-start archtype)
	grpup id -> package name 
	artifact id -> project name

2. add spring-core and spring-context dependency in pom.xml
   add
    ~~~~
    <maven.source.target>1.8</maven.source.target>
    <maven.compiler.target>1.8</maven.compiler.target>
    ~~~~
	so that you are using jre 1.8 instead of old version
	then right click on project then on maven  and update project

3. ctrl-shift-(L twice) for eclipse shortcuts window

-----------------
### (Creating a spring container) 
- in src/main/java
- add a Doctype inside xml file 
~~~~
<bean id = "unique identifier" class="fully qualified name of the class"> </bean>	
~~~~

-------------------
## All these inside app.java
###  initializing context
~~~~
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
~~~~

### getting an object
~~~~
Engineer engineer = context.getBean("myEngineer",Engineer.class);
~~~~

-------------------
## Dependency Injection
### Setter Injection (for primitives)
~~~~
<bean id="myEngineer" class="com.sample.socgen.SpringFirst.Engineer">
	<property name="userName" value="rohith"></property>
	<property name="userId" value="22"></property>
</bean>        
~~~~

### Constructor Injection
~~~~
<bean id="myEngineer" class="com.sample.socgen.SpringFirst.Engineer">
	<constructor-arg value="rohith"></constructor-arg>
</bean>        
~~~~

### Setter Injection (for Object types)
~~~~
<bean id="myEngineer" class="com.sample.socgen.SpringFirst.Engineer">
    <property name="address" ref="address-bean-id">
</bean>        
~~~~

### Initializing collections 
~~~~
<bean id="myEngineer" class="com.sample.socgen.SpringFirst.Engineer">
    <property name="address" >
		<list>
			<ref bean="address1"/>
			<ref bean="address2"/>
			<ref bean="address3"/>
		</list>
	</property>
</bean>  

~~~~

### Inner Bean
~~~~
<bean id="myEngineer" class="com.sample.socgen.SpringFirst.Engineer">
    <constructor-arg>
		<bean class="">
			<property ...> </property>
		</bean>
	</constructor-arg>
</bean> 
~~~~

- There is a init and destroy for each bean.
- There is also a default-init and destroy for all beans as a whole.

### Auto Wiring
~~~~
<bean id="myEngineer" class="com.sample.socgen.SpringFirst.Engineer" autowire="byName">
    ...
</bean> 
~~~~

# Annotations
---------------------
## for annotations to work
- do this in the <span><beans></span>tag inside xml file
- add the xml namespaces for annotations
	- link : https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s11.html


~~~~
	<beans xmlns="http://www.springframework.org/schema/beans"
	   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
               
     <context:annotation-config/>

 ~~~~


- and remove the doctype i.e 

~~~~
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"  "http://www.springframework.org/dtd/spring-beans-2.0.dtd">
~~~~

from the xml file

## autowire using annotations
~~~~
//By Default autowired check "byName" later on check "byType". if you want to specify explicitly use @Qualifer()
@Autowired
@Qualifier("address2")
public void setAddress(Address address){
	this.address = address;
}

//Autowired can be used directly upon the variable

@Autowired
Address addressOne;
// now addressOne autowired
// **In this case, no need of setter method also. you can just delete the seteter method and it would still work fine.**
~~~~

--------------------

- ***JSR (java specification resource) 250 Specific annotations***
  - These are standard across frameworks
  - @Resource(name="address") is used instead of @Autowire and @Qualifier
  - @PostConstruct -> for specifying bean init method
  - @PreDestroy -> for specifying  destroy method

-  ***Spring Streotype Annotations***
     - **MVC Based**
     - @Controller -> instead of @Component (stand for C in MVC)
     - @Repository -> for dao class (M in MVC)
     - @SErvice -> for Service class


--------------------

## Annotation for bean
You have put <span> <context:component-scan base-package="com...package.."></context:somponent-scan></span> in xml file
~~~~
@Component("yourIdAsYourWishInCamelCase")
class ABC implements... {

}
//By using this, bean is registered automatically. no need to create explicitly in the xml file
//you can use @Controller instead of @Component
~~~~









