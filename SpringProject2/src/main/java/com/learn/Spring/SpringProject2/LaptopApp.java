package com.learn.Spring.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopApp 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("config.xml");
        Laptop lp=(Laptop)ctx1.getBean("jk");
        
    	System.out.println(lp);
    }
}
