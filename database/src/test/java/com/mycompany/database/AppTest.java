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
        instance.dropTable(tab);
    }

    /**
     * Test of select method, of class App.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        String tab = "this_table";
        App instance = new App();
        instance.createTable(tab);
        instance.select(tab);
        instance.dropTable(tab);
    }

    /**
     * Test of insert method, of class App.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String tab = "this_table";
        String n = "'Name'";
        String a = "11";
        String m = "'Thank you for the warm mittens'";
        App instance = new App();
        instance.createTable(tab);
        instance.insert(tab, n, a, m);
        instance.dropTable(tab);
    }

    /**
     * Test of update method, of class App.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String tab = "this_table";
        String colName = "age";
        String val = "11";
        String destColName = "message";
        String destVal = "'Thank you for the warm gloves'";
        App instance = new App();
        instance.createTable(tab);
        instance.insert(tab, "'Name'", "11", "'Thank you for the warm mittens'");
        instance.update(tab, colName, val, destColName, destVal);
        instance.dropTable(tab);
    }

    /**
     * Test of delete method, of class App.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String tab = "this_table";
        String destColName = "id";
        String destVal = "1";
        App instance = new App();
        instance.createTable(tab);
        instance.insert(tab, "'Name'", "11", "'Thank you for the warm mittens'");
        instance.delete(tab, destColName, destVal);
        instance.dropTable(tab);
    }

    /**
     * Test of dropTable method, of class App.
     */
    @Test
    public void testDropTable() {
        System.out.println("dropTable");
        String tab = "";
        App instance = new App();
        instance.createTable(tab);
        instance.dropTable(tab);
    }

    /**
     * Test of stringsOk method, of class App.
     */
    @Test
    public void testStringsOk() {
        System.out.println("stringsOk");
        String col = "age";
        String val = "'8'";
        App instance = new App();
        boolean expResult = false;
        boolean result = instance.stringsOk(col, val);
        assertEquals(expResult, result);
    }
    
}
