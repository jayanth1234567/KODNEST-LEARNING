package com.learn.Spring.SpringProject3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Employee lp=(Employee)ctx.getBean("emp");
    	System.out.println(lp);
    }
}
