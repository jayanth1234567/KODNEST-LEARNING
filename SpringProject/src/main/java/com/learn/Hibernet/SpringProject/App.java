package com.learn.Hibernet.SpringProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Student stobj=(Student) ctx.getBean("st");
        JavaTeacher jt=(JavaTeacher)ctx.getBean("jt");
        SqlTeacher sql=(SqlTeacher)ctx.getBean("sqt");
        PythonTeacher pt=(PythonTeacher)ctx.getBean("pt");
    	System.out.println(stobj);
    	System.out.println(jt);
    	System.out.println(sql);
    	System.out.println(pt);
    }
}
