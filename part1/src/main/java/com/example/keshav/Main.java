package com.example.keshav;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Main {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","keshav1234");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from students");
        while(rs.next()){
            String name=rs.getString("name");
            int marks=rs.getInt("marks");
            System.out.println(name+" has secured "+marks);   
        }
        // st=con.createStatement();
        // st.executeUpdate("insert into students values(45,'Mohan',89)");

       // st.executeUpdate("update students set marks=99 where roll_no=45");
        st.executeUpdate("delete from students where roll_no=45");
    }
}