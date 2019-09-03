/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lolak
 */
public class AppTest {
    
    public AppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getGreating method, of class App.
     */
    @org.junit.jupiter.api.Test
    public void testGetGreating() {
        System.out.println("getGreating");
        App instance = new App();
        String expResult = "Hello ";
        String result = instance.getGreating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGreating method, of class App.
     */
    @org.junit.jupiter.api.Test
    public void testSetGreating() {
        System.out.println("setGreating");
        String greating = "";
        App instance = new App();
        instance.setGreating(greating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWho method, of class App.
     */
    @org.junit.jupiter.api.Test
    public void testGetWho() {
        System.out.println("getWho");
        App instance = new App();
        String expResult = "World";
        String result = instance.getWho();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWho method, of class App.
     */
    @org.junit.jupiter.api.Test
    public void testSetWho() {
        System.out.println("setWho");
        App instance = new App();
        String expResult = "not " + instance.getWho();
        instance.setWho(" ");
        String result = instance.getWho();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of main method, of class App.
     */
    @org.junit.jupiter.api.Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        App.main(args);
    }

    /**
     * Test of playBall method, of class App.
     */
    @Test
    public void testPlayBall() {
        System.out.println("playBall");
        App instance = new App();
        instance.playBall();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer method, of class App.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        String player = "";
        App instance = new App();
        instance.setPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
