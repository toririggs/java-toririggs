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



public class App {
    Connection con;
    
    public static void main(String[] args) {
        App app = new App();
        app.run();
        
    }
    
    void run(){
        try{   
            openConnect();
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from test");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            closeConnect();
        }catch(Exception e){ System.out.println(e);}  
    }
    
    void openConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1111"); 
        }catch(Exception e){System.out.print(e);}
        
    }
    
    void closeConnect() {
        try{
            con.close();
        }catch(Exception e){System.out.print(e);}
    }
}