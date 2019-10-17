/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collections;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lolak
 */
public class AppTest {

    /**
     * Test of showMenu method, of class App.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        App instance = new App();
        instance.showMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class App.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        App instance = new App();
        instance.addItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteItem method, of class App.
     */
    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        App instance = new App();
        instance.deleteItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void test1() {
        App instance = new App();
        instance.showMenu();
        
    }
}
