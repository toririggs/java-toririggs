/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi;

/**
 *use .equals() to compare two strings
 * urban institute
 * @author lolak
 */
public class App {

    private String greating = "Hello ";
    public String getGreating() {
        return greating;
    }
    public void setGreating(String greating) {
        this.greating = greating;
    }
    
    private String who = "World";
    public String getWho() {
        return who;
    }
    
    public void setWho(String who) {
        this.who = who;
    }
    
    private String message = null;
    
    public String getMessage() {
        if(message == null){
            message = getGreating() + getWho() + "!";
        }
        return message;
    }
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }
    /*comments*/
    //one line comment
    
    private void run() {
        System.out.println(getMessage());
    }
}
