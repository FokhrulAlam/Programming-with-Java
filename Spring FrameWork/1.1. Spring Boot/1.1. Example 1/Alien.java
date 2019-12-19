package com.fokhrul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * By default, Spring follows Singleton Design Pattern. That means
 * it creates a single instance. But we can change it specifying 
 * a scope "prototype". Then Spring will create the object only when
 * it will be prompted to create one.
 */
@Component		//using Component, we tell Spring to create objects of this class
@Scope(value="prototype")
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	
	/**
	 * An object of Alien is already in the Spring container.
	 * A Laptop type object is also there. Alien depends on Laptop
	 * in this case. To inform Alien object about the availability of Laptop object
	 * we will use Autowired.
	 * By default Autowired searches by type.
	 * Qualifier searches by name.
	 */
	@Autowired
	@Qualifier("laptop")
	private Laptop laptop;
	
	/**
	 * constructor 
	 */
	public Alien() {
		System.out.println("object created");
	}
	
	/**
	 * getter and setter methods
	 */
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("Hello from Fokhrul");
		laptop.compile();
	}
	
	

}
