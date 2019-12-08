package com.example.myapplication;

import java.sql.*;
import android.database.Cursor;
import android.util.Log;

public class DBHelper {
    Connection con;
    private static final String TAG = "MyMessage";

    void connectUsers() {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            con = DriverManager.getConnection("jbdc:mysql://localhost:3306/users", "root", "1111");
        }catch(Exception e){Log.i(TAG, e.toString());}
    }

    void connectStatus() {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            con = DriverManager.getConnection("jbdc:mysql://localhost:3306/status", "root", "1111");
        }catch(Exception e){System.out.print(e);}
    }

    void disconnect() {
        try{
            con.close();
        }catch(Exception e){System.out.print(e);}
    }

    void addUser(String name, String email) {
        try{
            Log.i(TAG,"got to add user");
            connectUsers();
            Log.i(TAG,"successfully connected");
            PreparedStatement stmt = con.prepareStatement("insert into users (user_name,email) values (?,?);");
            Log.i(TAG,"should have created statement");
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();
            Log.i(TAG,"should have inserted");
            disconnect();
            Log.i(TAG,"successfully disconnected");
        }catch(Exception e){System.out.print(e);}
    }
}
