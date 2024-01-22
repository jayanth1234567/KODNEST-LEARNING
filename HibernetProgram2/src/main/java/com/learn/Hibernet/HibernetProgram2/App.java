package com.learn.Hibernet.HibernetProgram2;


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
    	
    	Person p=new Person();
    	Person p1=new Person();
    	Person p2=new Person();
    	
    	Bike b=new Bike(2321,"jawa",1000000,p);
    	Bike b1=new Bike(6732,"Bullet",500000,p1);
    	Bike b2=new Bike(3243,"MT15",250000,p2);
    	
    	p.setId(1);
    	p.setName("jayanth krishna");
    	p.setAge(22);
    	p.setB(b);
    	
    	p1.setId(15);
    	p1.setName("jayanth krishna");
    	p1.setAge(22);
    	p1.setB(b1);
    	
    	
    	p2.setId(19);
    	p2.setName("jayanth krishna");
    	p2.setAge(22);
    	p2.setB(b2);
    	
    	session.save(p);
    	session.save(p1);
    	session.save(p2);
    	session.save(b);
    	session.save(b1);
    	session.save(b2);
    	
    	tr.commit();
        System.out.println( "Student object is created and saved " );
    }
}

