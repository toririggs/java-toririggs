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
        String table = "thank_you";
        createTable(table);
        insert(table, "'Albert'", "8", "'Thank you for donating the socks. I like that they have dinosaurs on them'");
        select(table);
        update(table, "age", "9", "name", "'Albert'");
        select(table);
        delete(table, "id", "2");
        dropTable(table);
    }
    
    void openConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","1111"); 
        }catch(Exception e){System.out.print(e);}
        
    }
    
    void createTable(String tab){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("create table if not exists " + tab + " (\n"
                       + "id int NOT NULL AUTO_INCREMENT,"
                       + "name text,"
                       + "age int,"
                       + "message text NOT NULL,"
                       + "PRIMARY KEY (id));");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void select(String tab){
        try{   
            openConnect();
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from " + tab + ";");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
            closeConnect();
        }catch(Exception e){ System.out.println(e);}  
    }
    
    void insert(String tab, String n, String a, String m){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("insert into " + tab + "(name,age,message) values(" + n + "," + a + "," + m + ");");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void update(String tab, String colName, String val, String destColName, String destVal){
        try{
            openConnect();
            if (stringsOk(colName, val) && stringsOk(destColName, destVal)){
                Statement stmt = con.createStatement();
                stmt.execute("update " + tab + " set " + colName + "=" + val + " where " + destColName + "=" + destVal + ";");
            }else{
                System.out.println("Incorrect syntax. Column names are age, name, or message, and the values for name and message must begin and end with this symbol: ' ");
            }
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void delete(String tab, String destColName, String destVal){
        try{
            openConnect();
            if (stringsOk(destColName, destVal)){
                Statement stmt = con.createStatement();
                stmt.execute("delete from " + tab + " where " + destColName + "=" + destVal + ";");
            }else{
                System.out.println("Incorrect syntax. Column names are id, age, name, or message, and the values for name and message must begin and end with this symbol: ' ");
            }
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void dropTable(String tab){
        try{
            openConnect();
            Statement stmt = con.createStatement();
            stmt.execute("drop table " + tab + ";");
            closeConnect();
        }catch(Exception e){System.out.println(e);}
    }
    
    void closeConnect() {
        try{
            con.close();
        }catch(Exception e){System.out.print(e);}
    }
    
    boolean stringsOk(String col, String val){
        if (col == "name" || col == "message"){
            boolean ret = (val.startsWith("'") && val.endsWith("'"));
            return ret;
        }
        else if (col == "age" || col == "id"){
            boolean ret = (!(val.startsWith("'")) && !(val.endsWith("'")));
            return ret;
        }else {return false;}
    }
}