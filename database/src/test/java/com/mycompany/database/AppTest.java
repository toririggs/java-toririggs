/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database;

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

    /**
     * Test of run method, of class App.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        App instance = new App();
        instance.run();
    }

    /**
     * Test of createTable method, of class App.
     */
    @Test
    public void testCreateTable() {
        System.out.println("createTable");
        String tab = "this_table";
        App instance = new App();
        instance.createTable(tab);
        instance.openConnect();
        // may need to use try catch and select to find if table exists
        instance.closeConnect();
    }

    /**
     * Test of select method, of class App.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        String tab = "";
        App instance = new App();
        instance.select(tab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class App.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String tab = "";
        String n = "";
        String a = "";
        String m = "";
        App instance = new App();
        instance.insert(tab, n, a, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class App.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String tab = "";
        String colName = "";
        String val = "";
        String destColName = "";
        String destVal = "";
        App instance = new App();
        instance.update(tab, colName, val, destColName, destVal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class App.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String tab = "";
        String destColName = "";
        String destVal = "";
        App instance = new App();
        instance.delete(tab, destColName, destVal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dropTable method, of class App.
     */
    @Test
    public void testDropTable() {
        System.out.println("dropTable");
        String tab = "";
        App instance = new App();
        instance.dropTable(tab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnect method, of class App.
     */
    @Test
    public void testCloseConnect() {
        System.out.println("closeConnect");
        App instance = new App();
        instance.closeConnect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringsOk method, of class App.
     */
    @Test
    public void testStringsOk() {
        System.out.println("stringsOk");
        String col = "";
        String val = "";
        App instance = new App();
        boolean expResult = false;
        boolean result = instance.stringsOk(col, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
