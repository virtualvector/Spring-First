"# Spring-First" 
Spring works on IOC(Inversion of control) and DI (Dependency Injection)



1. create a new maven project (select maven-quick-start archtype)
	grpup id -> package name 
	artifact id -> project name
2. add spring-core and spring-context dependency in pom.xml
   add <maven.source.target>1.8</maven.source.target>
    <maven.compiler.target>1.8</maven.compiler.target>
	so that you are using jre 1.8 instead of old version
	then right click on project then on maven  and update project

3. ctrl-shift-(L twice) for eclipse shortcuts window

-----------------
> (Creating a spring container) in src/main/java
- add a Doctype inside xml file 
- <bean id = "unique identifier" class="fully qualified name of the class"> </bean>
    	
    	

-------------------
##  initializing context
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

## getting an object
Engineer engineer = context.getBean("myEngineer",Engineer.class);
    	


