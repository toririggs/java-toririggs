/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kattis;

import java.util.Scanner;
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

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        
    }

    /**
     * Test of run method, of class App.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        App instance = new App();
        instance.in = new Scanner("1 2 3");
        instance.run();
    }

    /**
     * Test of read method, of class App.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        App instance = new App();
        instance.read();
    }

    /**
     * Test of write method, of class App.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        App instance = new App();
        instance.write();
    }

    /**
     * Test of solve method, of class App.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        App instance = new App();
        instance.solve();
    }
    
}
