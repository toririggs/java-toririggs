/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads;

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
     * Test using 1 thread
     */
    @Test
    public void testOne() {
        System.out.println("Test One");
        App instance = new App();
        instance.in = new Scanner("1\n3\n4\n7\n");
        instance.run();
    }
    
    /**
     * Test using 2 threads
     */
    @Test
    public void testTwo() {
        System.out.println("Test Two");
        App instance = new App();
        instance.in = new Scanner("2\n3\n4\n7\n6\n3\n9\n");
        instance.run();
    }
    
    /**
     * Test using 3 threads
     */
    @Test
    public void testThree() {
        System.out.println("Test Three");
        App instance = new App();
        instance.in = new Scanner("3\n3\n4\n7\n6\n3\n9\n4\n9\n4\n");
        instance.run();
    }
    
    /**
     * Test using 4 threads
     */
    @Test
    public void testFour() {
        System.out.println("Test Four");
        App instance = new App();
        instance.in = new Scanner("4\n3\n4\n7\n6\n3\n9\n4\n9\n4\n6\n2\n4\n");
        instance.run();
    }
    
        /**
     * Test using 5 threads
     */
    @Test
    public void testFive() {
        System.out.println("Test Five");
        App instance = new App();
        instance.in = new Scanner("5\n3\n4\n7\n6\n3\n9\n4\n9\n4\n6\n2\n4\n5\n5\n5\n");
        instance.run();
    }
}
