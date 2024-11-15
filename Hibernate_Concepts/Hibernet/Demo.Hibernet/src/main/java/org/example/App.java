package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App
{
    public static void main( String[] args )
    {
        AlienName am = new AlienName();
        am.setfName("NavinKumarReddy1");
        am.setlName("Tharipally1");
        am.setmName("BapReddy");

        Alien a = new Alien();
        a.setAid(102);
        a.setColor("Green");
        a.setName(String.valueOf(am));

        AlienName am1 = new AlienName();
        am1.setfName("Anup");
        am1.setmName("Kumar");
        am1.setlName("Reddy");

        Alien a1 = new Alien();
        a1.setName(String.valueOf(am1));
        a1.setAid(103);
        a1.setColor("pink");

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
        // Building the ServiceRegistry
        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session s = sf.openSession();

        //To follow with acid properties atomicity,consistency, isolation, and durability, we make an object of Transaction and begin it.
        Transaction tx = s.beginTransaction();
        s.save(a);
        s.save(a1);

        //commit the changes to the databases.
        tx.commit();

        a =  s.get(Alien.class,101); //To fetch the data from the database

        s.close();
        sf.close();
    }
}
