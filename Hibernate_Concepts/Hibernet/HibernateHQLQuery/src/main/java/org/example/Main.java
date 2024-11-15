package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.springframework.jdbc.object.SqlQuery;



import java.util.List;
import java.util.Random;

import static org.hibernate.Session.*;

public class Main {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(NewStudent.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session s = sf.openSession();
        s.beginTransaction();

        Random r = new Random();
        /*
        for(int i =1;i<=50;i++){
            NewStudent stu = new NewStudent();
            stu.setRollNo(i);
            stu.setName("Navin"+i);
            stu.setMarks(r.nextInt(100));
            s.save(stu);
        }
        */

        //This Query helps you to fetch the details of all student.
        Query q = s.createQuery("from NewStudent");
        List<NewStudent> stu= q.list();
        for(NewStudent stud : stu){
            System.out.println(stud);
        }
        s.getTransaction().commit();
        System.out.println("Hello World");

        //using where clause
        Query q1 = s.createQuery("from NewStudent where marks>50");
        List<NewStudent> stu1= q1.list();
        for(NewStudent stud : stu1){
            System.out.println(stud);
        }

        //If we want to fetch something specific...
        //uniqueResult gives you the unique value...
        Query q2 = s.createQuery("from NewStudent where rollNo = 5");
        NewStudent stu2= (NewStudent) q2.uniqueResult();
        System.out.println(stu2);

        /*
        Now if we want to fetch the specific columns from a table for that also we can write HQL Query.
        In that case as may we not fetch all column all the time so we are not calling the entire Student Object. So instead of creating a
        object of Student we are making  Object of array..
        Now why not List of String because here  we are ahving different values of different types such as marks and roll are of type int and
        name is a type of String. And through Object only we can store multiple values of different type. And as we have three object roll,marks and name
        so we are using Object of Array.
        */
        Query q3 = s.createQuery("select rollNo,name,marks from NewStudent where rollNo = 7");
        Object[] stu3 = (Object[]) q3.uniqueResult();

        for(Object o : stu3){
            System.out.println(o);
        }

        //Now if i'm removing whre clause from it and want to fetch the specific column information
        Query q4 = s.createQuery("select name,marks from NewStudent");
        List<Object[]> students = q4.list();
        for(Object[] studs : students){
            // System.out.println(studs); ->it will print eack object present in a list - Ljava.lang.Object;@7c9372ed
            System.out.println(" " + studs[0] + " " + studs[1]);
        }

        //If we are having two different table for suppose in join concept, having two column with same name like marks,
        //To specify which table's marks we want, we can use the concept alice
        Query q5 = s.createQuery("select name, marks from NewStudent ns where ns.marks>60");
        List<Object[]> studs1 = q5.list();
        for(Object[] studs2 : studs1){
            System.out.println(" " + studs2[0] + " " + studs2[1]);
        }

        //sum of marks where marks>50
        Query q6 = s.createQuery("select sum(marks) from NewStudent ns where ns.marks>50");

        /*
        List studs22 = q6.list();
        for(Object marks : studs22){
            System.out.println(marks);
        }
        */
        Object marks = q6.uniqueResult();
        System.out.println(marks);

        //As its single long integer value we can also fetch it like this..
        long mark = (long) q6.uniqueResult();
        System.out.println(mark);

        //When we want to specify the value later we can use the colon
        //: works s a positional Parameter. In JDBC we are done with prepared statement, the same stuff is here.s
        int b = 80;
        Query q7 = s.createQuery("select sum(marks) from NewStudent ns where ns.marks> :b");
        q7.setParameter("b",b);
        long mark1 = (long) q6.uniqueResult();
        System.out.println(mark1);

        /*
        Now instead of filing a SQL query if we want to file a HQL query
        SqlQuery query = Session.createSQLQuery("select * from student");
        query.addEntity(Student.class);
        for(Student o : students){
            System.out.println(o);
        */



        s.getTransaction().commit();
        System.out.println("Hello World");
    }
}