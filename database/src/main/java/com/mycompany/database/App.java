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
        createTable();
        insert();
        select();
        update();
        select();
        delete();
        dropTable();
    }
    
    void openConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1111"); 
        }catch(Exception e){System.out.print(e);}
        
    }
    
    void createTable(){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("create table if not exists thank_you (\n"
                       + "id int NOT NULL AUTO_INCREMENT,"
                       + "name text,"
                       + "age int,"
                       + "message text NOT NULL,"
                       + "PRIMARY KEY (id));");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void select(){
        try{   
            openConnect();
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from thank_you");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
            closeConnect();
        }catch(Exception e){ System.out.println(e);}  
    }
    
    void insert(){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("insert into thank_you(name,age,message) values('Albert',8,'Thank you for donating the socks. I like that they have dinosaurs on them.');");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void update(){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("update thank_you set age=9 where name='Albert';");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void delete(){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("delete from thank_you where id=2");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void dropTable(){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("drop table thank_you;");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void closeConnect() {
        try{
            con.close();
        }catch(Exception e){System.out.print(e);}
    }
}