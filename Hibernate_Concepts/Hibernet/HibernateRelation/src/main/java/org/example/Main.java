package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {

        Student stu = new Student();
        Laptop lap = new Laptop();

        lap.setlId(101);
        lap.setlName("Dell");

        stu.setRollNo(1);
        stu.setsName("Anu");
        stu.setLaptop(lap);

        //OneToMany
        stu.getLaptops().add(lap);

        //ManyToMany
        lap.getStudents().add(stu);

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();

        s.persist(stu);
        s.persist(lap);

        tx.commit();

        s.close();
        sf.close();
    }
}