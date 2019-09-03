/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi;

/**
 *
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
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
        app.playBall();
        String player = "steve";
        app.setPlayer(player);
    }
    
    private void run() {
        System.out.println(getGreating() + getWho() + "!");
    }

    public void playBall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPlayer(String player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
