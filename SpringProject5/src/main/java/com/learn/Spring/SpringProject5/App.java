package com.learn.Spring.SpringProject5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Car c = (Car)ctx.getBean("car1");
        Car c2 = (Car)ctx.getBean("car2");
    	System.out.println(c);
    	System.out.println(c2);
    }
}
