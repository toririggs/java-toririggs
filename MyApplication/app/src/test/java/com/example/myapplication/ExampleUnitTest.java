package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

// Testing for DBHelper
public class ExampleUnitTest {
    MainActivity ma = new MainActivity();
    DBHelper db = new DBHelper(ma);
    @Test
    public void testAdd() {
        db.addUser("Bob", "email@example.com");
    }

    @Test
    public void testUpdate() {
        db.updateStatus(1, "READY", 1001);
    }

    @Test
    public void testGetUser() {
        assertNotNull(db.getUser(1));
    }

    @Test
    public void testGetItem() {
        assertNotNull(db.getItem(1));
    }

    @Test
    public void testGetUsers() {
        assertNotNull(db.getUsers());
    }
}