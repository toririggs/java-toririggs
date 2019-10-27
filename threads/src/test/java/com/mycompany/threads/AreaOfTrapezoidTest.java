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
        int b1 = 0;
        int b2 = 0;
        int h = 0;
        AreaOfTrapezoid instance = new AreaOfTrapezoid();
        int expResult = 0;
        int result = instance.findArea(b1, b2, h);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArea method, of class AreaOfTrapezoid.
     */
    @Test
    public void testPrintArea() {
        System.out.println("printArea");
        int area = 0;
        AreaOfTrapezoid instance = new AreaOfTrapezoid();
        instance.printArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
