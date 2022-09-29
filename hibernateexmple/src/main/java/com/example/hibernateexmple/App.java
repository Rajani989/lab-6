package com.example.hibernateexmple;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new Configuration().configure().addAnnotatedClass(agent.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tr=session.beginTransaction();
    	
    agent a1=new agent();
   
        a1.setId(4);   
    	a1.setName("sagar");
    	a1.setCity("pratap nagar");
    	a1.setCom_amt(13);
    	
    	session.save(a1);
    	tr.commit();
    	
    	Query q=session.createQuery("from agent");
    	List<agent> e=q.list();
    	for(agent e1:e)
    	{
    		System.out.println("id: "+e1.getId()+" name: "+e1.getName()+" city "+e1.getCity()+"  commision amount: "+e1.getCom_amt());
    	}
    	session.flush();
    	session.close();
        System.out.println( " Record inserted " );
    
    }
}
