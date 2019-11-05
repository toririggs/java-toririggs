/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database;

/**
 *
 * @author lolak
 */

import java.sql.*;  

public class App{  
    public static void main(String args[]){  
        App app = new App();
        app.run();
    }
    
    void run(){
        System.out.println("got here");
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1111");  
            //here db is database name, root is username and 1111 is password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from test");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        }catch(Exception e){ System.out.println(e);}  
    }
}  

//public class App {

//    public static void main(String[] args) {
//        MysqlCon connect = new MysqlCon();
        
//    }

//}