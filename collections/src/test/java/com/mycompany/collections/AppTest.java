/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

/**
 * Test all functions that return a value by asserting. Test delete function multiple times to test each part of switch statement.
 * @author lolak
 */
public class AppTest {
    
    public AppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of closing the shopping list.
     */
    @Test
    public void testZero() {
        System.out.println("Test Zero");
        App instance = new App();
        instance.in = new Scanner("0\n");
        instance.run();
    }

    /**
     * Test of initList method, of class App. Checks if return value is List initialized!
     */
    @Test
    public void testInitList() {
        System.out.println("initList");
        App instance = new App();
        String expResult = "List initialized!";
        String result = instance.initList();
        assertEquals(expResult, result);
    }

    /**
     * Test of showing the shopping list from the menu. Note that this test must also close out of the shopping list
     * program, and it will activate the pause() function
     */
    @Test
    public void testOne() {
        System.out.println("Test One");
        App instance = new App();
        instance.in = new Scanner("1\n\n0\n");
        instance.run();
    }

    /**
     * Test of adding to the shopping list from the menu. Note that this test must also close out of the shopping
     * list program, and it will activate the pause() function
     */
    @Test
    public void testTwo() {
        System.out.println("Test Two");
        App instance = new App();
        instance.in = new Scanner("2\nchicken\n\n0\n");
        instance.run();
    }

    /**
     * Test of calling the delete function but entering an incorrect number from the menu. Note that this test must
     * also close out of the shopping list program, and it will activate the pause() function
     */
    @Test
    public void testThree() {
        System.out.println("Test Three");
        App instance = new App();
        instance.in = new Scanner("3\n5\n\n0\n");
        instance.run();
    }

    /**
     * Test of calling the delete function and deleting one item from the menu. Note that this test must
     * also close out of the shopping list program, and it will activate the pause() function
     */
    @Test
    public void testFour() {
        System.out.println("Test Four");
        App instance = new App();
        instance.in = new Scanner("3\n1\neggs\n\n0\n");
        instance.run();
    }

    /**
     * Test of calling the delete function and deleting the whole list from the menu. Note that this test must
     * also close out of the shopping list program, and it will activate the pause() function
     */
    @Test
    public void testFive() {
        System.out.println("Test Five");
        App instance = new App();
        instance.in = new Scanner("3\n2\n\n0\n");
        instance.run();
    }

    /**
     * Test of activating the default function from the menu. Note that this test must also close out of the shopping list
     * program, and it will activate the pause() function
     */
    @Test
    public void testSix() {
        System.out.println("Test Six");
        App instance = new App();
        instance.in = new Scanner("6\n\n0\n");
        instance.run();
    }

    /**
     * Test of showList method, of class App. Note that the shopping list will be empty because it hasn't been
     * initialized
     */
    @Test
    public void testShowList() {
        System.out.println("showList");
        App instance = new App();
        String expResult = "The shopping list contains: []";
        String result = instance.showList();
        assertEquals(expResult, result);
    }

    /**
     * Test of addItem method, of class App.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        App instance = new App();
        String item = "lettuce";
        instance.in = new Scanner(item);
        String addedItem = instance.addItem();
        assertEquals(item, addedItem);
    }

    /**
     * Test of deleteItem method, of class App. Note that the list will be empty because it has not been initialized,
     * so the function will simply print a line and close.
     */
    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        App instance = new App();
        instance.deleteItem();
    }
    
}
