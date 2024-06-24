package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Main {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root","keshav1234");
        PreparedStatement ps=con.prepareStatement("select * from students");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            String name=rs.getString("name");
            int marks=rs.getInt("marks");
            System.out.println(name+" has secured "+marks);
        }

        // ps=con.prepareStatement("insert into students values(?,?,?)");
        // ps.setInt(1, 56);
        // ps.setString(2, "Mohan");
        // ps.setInt(3, 89);
        // ps.executeUpdate();

        // ps=con.prepareStatement("update students set marks=? where roll_no=?");
        // ps.setInt(1, 56);
        // ps.setInt(2, 99);
        // ps.executeUpdate();

        // ps=con.prepareStatement("delete from students where roll_no=?");
        // ps.setInt(1, 56);
        // ps.executeUpdate();
    }
}