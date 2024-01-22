package com.learn.Spring.SpringProject6;

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
        University u=(University)ctx.getBean("u1");
    	System.out.println(u);
    }
}
