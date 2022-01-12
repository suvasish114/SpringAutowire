package com.example.SpringAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    public static void main( String[] args ){
       Laptop laptop = context.getBean("laptop", Laptop.class);
       laptop.getLaptopDetails();
    }
}
