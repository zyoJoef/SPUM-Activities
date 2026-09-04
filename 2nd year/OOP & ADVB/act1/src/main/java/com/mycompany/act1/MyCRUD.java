package com.mycompany.act1;

import java.sql.*;
// import java.sql.DriverManager;

public class MyCRUD {
    
    private String dbuser="root";
    private String dbpass="";
    private String dburl="jdbc:mysql://localhost:3306/cs2_db?zeroDateTimeBehavior=CONVERT_TO_NULL";
    Statement stmt;
    Connection con;
    ResultSet rs;
    void myconnect() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        this.con = DriverManager.getConnection(this.dburl,this.dbuser,this.dbpass);
        this.stmt = this.con.createStatement();
    }        
    
    void mygetall() throws SQLException
    {
         this.rs = this.stmt.executeQuery("SELECT `id`, `fname`, `mname`, `lname`, `course` FROM `tbl_student`;");
                 
            while (this.rs.next()) {
                int id = this.rs.getInt("id");
                String myfname = this.rs.getString("fname");
                String mymname = this.rs.getString("mname");
                String mylname = this.rs.getString("lname");
                String mycourse = this.rs.getString("course");
                
                
            System.out.println("Student info: " + myfname + "" + mymname + "" + mymname + mylname + "" + mycourse + "");  
        }
    }
}