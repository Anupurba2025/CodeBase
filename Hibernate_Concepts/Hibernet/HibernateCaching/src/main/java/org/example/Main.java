package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
       New_Alien a = new New_Alien();
       a.setAid(101);
       a.setName("Anup Kumar");
       a.setColor("Green");

       New_Alien a1 = new New_Alien();
       a1.setAid(102);
       a1.setName("Navin Kumar Reddy");
       a1.setColor("Blue");

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(New_Alien.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session session1 = sf.openSession();
        session1.beginTransaction();

        session1.save(a);
        session1.save(a1);

        New_Alien res = session1.get(New_Alien.class, 1);
        New_Alien res1 = session1.get(New_Alien.class,1);

        System.out.println(res);
        System.out.println(res1);

        session1.getTransaction().commit();
        session1.close();

        //Another session called session 2
        Session session2 = sf.openSession();
        session2.beginTransaction();

        New_Alien res3 = session2.get(New_Alien.class, 1);
        New_Alien res4 = session2.get(New_Alien.class,1);

        System.out.println(res3);
        System.out.println(res4);

        session2.getTransaction().commit();


        //instead of using get method here we are using query
        Query q1=session2.createQuery("from New_Alien where Aid=1");

        //To know your query that you are using cache here we need to write the below line
        q1.setCacheable(true);
        New_Alien a2 = (New_Alien) q1.uniqueResult();
        session2.close();

        sf.close();



    }
}