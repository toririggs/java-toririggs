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
public class AreaOfTrapezoidTest {
    
    public AreaOfTrapezoidTest() {
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
     * Test of findArea method, of class AreaOfTrapezoid.
     */
    @Test
    public void testFindArea() {
        System.out.println("findArea");
        int b1 = 5;
        int b2 = 10;
        int h = 3;
        int expResult = ((b1 + b2)/2) * h;
        AreaOfTrapezoid instance = new AreaOfTrapezoid();
        int result = instance.findArea(b1, b2, h);
        assertEquals(expResult, result);
    }

    /**
     * Test of printArea method, of class AreaOfTrapezoid.
     */
    @Test
    public void testPrintArea() {
        System.out.println("printArea");
        int b1 = 3;
        int b2 = 6;
        int h = 8;
        AreaOfTrapezoid instance = new AreaOfTrapezoid();
        instance.printArea(instance.findArea(b1, b2, h));
    }
    
}
