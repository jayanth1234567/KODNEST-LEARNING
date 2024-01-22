package com.learn.Hibernet.HidernateProgram1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	Student s=new Student(521,"jayanth",99);
    	session.save(s);
    	tr.commit();
        System.out.println( "Student object is created and saved " );
    }
}
