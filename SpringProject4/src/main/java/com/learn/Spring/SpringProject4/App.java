package com.learn.Spring.SpringProject4;

import java.io.ObjectInputStream.GetField;

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
        Employee empobj1=(Employee)ctx.getBean("emp");
    	System.out.println(empobj1);
    	
    	Employee empobj2=(Employee)ctx.getBean("emp2");
    	System.out.println(empobj2);
    	
    	CompanyXYZ cmpobj =(CompanyXYZ)ctx.getBean("jk");
    	System.out.println(cmpobj);
    }
}
