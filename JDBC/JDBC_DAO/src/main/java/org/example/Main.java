package org.example;

import java.sql.*;

import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        StudentDao dao = new StudentDao();
        dao.connect();
        Student s1 = dao.getStudent(5);
        Student s2 = new Student();
        s2.rollno = 16;
        s2.sName = "Lakkhan";
        dao.addStudent(s2);
        System.out.println(s1.sName);
    }
}
class StudentDao{
    Connection con = null;
    //jdbc connection is required to fetch the sname from the database
    public void connect(){
        String url = "jdbc:mysql://localhost:3306/jdbc"; //jdbc:mysql:database_name
        String uname = "root";
        String pass = "Anu@9382";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,uname,pass);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    public Student getStudent(int roll) throws ClassNotFoundException {

        try{
            Student s = new Student();
            s.rollno = roll;
            String query = "SELECT USER_NAME FROM STUDENT WHERE USER_ID = " + roll;
            //Statement st = con.createStatement();
            Statement st =  con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, // Enables scrolling
                    ResultSet.CONCUR_READ_ONLY         // Read-only mode
            );
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.sName = name;
            return  s;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public void addStudent(Student stud) throws SQLException {
        String query = "insert into student values(?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,stud.rollno);
        ps.setString(2, stud.sName);
        ps.executeUpdate();
    }
}
class Student{
    int rollno;
    String sName;
}