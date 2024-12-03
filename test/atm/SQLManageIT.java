/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package atm;

import java.sql.ResultSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dell
 */
public class SQLManageIT {
    
    public SQLManageIT() {
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
     * Test of check method, of class SQLManage.
     */
    @Test
    public void testCheck() throws Exception {
        System.out.println("check");
        String usr = "";
        String pass = "";
        SQLManage instance = new SQLManage();
        ResultSet expResult = null;
        ResultSet result = instance.check(usr, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class SQLManage.
     */
    @Test
    public void testDeposit() throws Exception {
        System.out.println("deposit");
        int amt = 0;
        int id = 0;
        SQLManage instance = new SQLManage();
        instance.deposit(amt, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class SQLManage.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        int amt = 0;
        int id = 0;
        SQLManage instance = new SQLManage();
        int expResult = 0;
        int result = instance.withdraw(amt, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pinchange method, of class SQLManage.
     */
    @Test
    public void testPinchange() throws Exception {
        System.out.println("pinchange");
        String pin = "";
        int id = 0;
        SQLManage instance = new SQLManage();
        instance.pinchange(pin, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of balCheck method, of class SQLManage.
     */
    @Test
    public void testBalCheck() throws Exception {
        System.out.println("balCheck");
        int id = 0;
        SQLManage instance = new SQLManage();
        int expResult = 0;
        int result = instance.balCheck(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stm method, of class SQLManage.
     */
    @Test
    public void testStm() throws Exception {
        System.out.println("stm");
        int id = 0;
        SQLManage instance = new SQLManage();
        ResultSet expResult = null;
        ResultSet result = instance.stm(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adding method, of class SQLManage.
     */
    @Test
    public void testAdding() throws Exception {
        System.out.println("adding");
        String card = "";
        String pin = "";
        String name = "";
        String bal = "";
        SQLManage instance = new SQLManage();
        instance.adding(card, pin, name, bal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
