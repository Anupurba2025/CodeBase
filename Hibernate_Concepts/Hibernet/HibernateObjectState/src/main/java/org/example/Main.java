package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(NewLaptop.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session s = sf.openSession();
        s.beginTransaction();

        //Transient State
        NewLaptop nl = new NewLaptop();
        nl.setLid(2);
        nl.setlBrand("Sony");
        nl.setlPrice(25000);

        //Persistent State
        s.save(nl);
        nl.setlPrice(60000); //As it's in Persistent State so it make changes in the database

        //Removed State
        s.remove(nl);

        s.getTransaction().commit();

        //Detatched State
        s.detach(nl);

    }
}