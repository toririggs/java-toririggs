/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads;

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
public class thTest {
    
    public thTest() {
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
     * Test of getB1 method, of class th.
     */
    @Test
    public void testGetB1() {
        System.out.println("getB1");
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        th instance = new th(obj);
        int set = 6;
        instance.setB1(set);
        int expResult = 6;
        int result = instance.getB1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setB1 method, of class th.
     */
    @Test
    public void testSetB1() {
        System.out.println("setB1");
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        th instance = new th(obj);
        int val1 = 1;
        int val2 = 2;
        instance.setB1(val1);
        int result1 = instance.getB1();
        instance.setB1(val2);
        int result2 = instance.getB1();
        assertNotEquals(result1, result2);
    }

    /**
     * Test of getB2 method, of class th.
     */
    @Test
    public void testGetB2() {
        System.out.println("getB2");
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        th instance = new th(obj);
        int set = 8;
        instance.setB2(set);
        int expResult = 8;
        int result = instance.getB2();
        assertEquals(expResult, result);
    }

    /**
     * Test of setB2 method, of class th.
     */
    @Test
    public void testSetB2() {
        System.out.println("setB2");
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        th instance = new th(obj);
        int val1 = 3;
        int val2 = 4;
        instance.setB2(val1);
        int result1 = instance.getB2();
        instance.setB2(val2);
        int result2 = instance.getB2();
        assertNotEquals(result1, result2);
    }

    /**
     * Test of getH method, of class th.
     */
    @Test
    public void testGetH() {
        System.out.println("getH");
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        th instance = new th(obj);
        int set = 9;
        instance.setH(set);
        int expResult = 9;
        int result = instance.getH();
        assertEquals(expResult, result);
    }

    /**
     * Test of setH method, of class th.
     */
    @Test
    public void testSetH() {
        System.out.println("setH");
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        th instance = new th(obj);
        int val1 = 1;
        int val2 = 2;
        instance.setH(val1);
        int result1 = instance.getH();
        instance.setH(val2);
        int result2 = instance.getH();
        assertNotEquals(result1, result2);
    }

    /**
     * Test of run method, of class th.
     */
    @Test
    public void testRun() {
        //testing both functions in AreaOfTrapezoid within AreaOfTrapezoidTest.java
    }
    
}
