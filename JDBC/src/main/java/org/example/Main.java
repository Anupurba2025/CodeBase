package org.example;

import java.sql.*;
import static java.lang.Class.forName;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        //Jdbc Connection
        String url = "jdbc:mysql://localhost:3306/jdbc"; //jdbc:mysql:database_name
        String uname = "root";
        String pass = "Anu@9382";
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(url,uname,pass);
        //Statement st = con.createStatement();
        Statement st =  con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, // Enables scrolling
                ResultSet.CONCUR_READ_ONLY         // Read-only mode
        );


        //Fetching the data from the database
        String query = "SELECT * FROM STUDENT";
        ResultSet rs = st.executeQuery(query);
        /*
        rs.next();
        String name = rs.getString("user_name");
        System.out.println(name); //RANU
        */
        while(rs.next()){
            String name = rs.getString("user_name");
            System.out.println(name);
        }

        // Reset the cursor to the beginning
        rs.beforeFirst();

        while(rs.next()){
            String user_data = rs.getInt("user_id") + " : " + rs.getString("user_name");
            System.out.println(user_data);
        }

        //Insert the new data into the database
        String query1 = "INSERT INTO STUDENT VALUES(13,'JARA')";
        int count = st.executeUpdate(query1);
        System.out.println(count + " row/s affected");

        int userId = 14;
        String userName = "RAJU";
        String query2 = "INSERT INTO STUDENT VALUES (" + userId + ",'" + userName + "')";
        int count1 = st.executeUpdate(query2);
        System.out.println(count1 + " row/s affected");

      /*
        When we are having dynamic values to insert prepare a statement like
        String query2 = "INSERT INTO STUDENT VALUES (" + userId + ",'" + userName + "')";
        is tough. So instead of using Statement we can use PreparedStatement here
      */

        int newUserId =15;
        String newUserName="HEERAK";
        String query3 = "INSERT INTO STUDENT VALUES (?,?)";
        PreparedStatement ps = con.prepareStatement(query3);
        ps.setInt(1,newUserId);
        ps.setString(2,newUserName);
        int count2 = ps.executeUpdate();
        System.out.println(count2 + " row/s affected");

        //Closing Statements...
        st.close();
        con.close();
    }
}