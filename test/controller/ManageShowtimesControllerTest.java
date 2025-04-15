/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controller;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class ManageShowtimesControllerTest {
    
    public ManageShowtimesControllerTest() {
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
     * Test of getAllMovies method, of class ManageShowtimesController.
     */
    @Test
    public void testGetAllMovies() {
        System.out.println("getAllMovies");
        ManageShowtimesController instance = new ManageShowtimesController();
        List<String> expResult = null;
        List<String> result = instance.getAllMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatesFor method, of class ManageShowtimesController.
     */
    @Test
    public void testGetDatesFor() {
        System.out.println("getDatesFor");
        String film = "";
        ManageShowtimesController instance = new ManageShowtimesController();
        List<String> expResult = null;
        List<String> result = instance.getDatesFor(film);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimesFor method, of class ManageShowtimesController.
     */
    @Test
    public void testGetTimesFor() {
        System.out.println("getTimesFor");
        String film = "";
        String date = "";
        ManageShowtimesController instance = new ManageShowtimesController();
        List<String> expResult = null;
        List<String> result = instance.getTimesFor(film, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHallsFor method, of class ManageShowtimesController.
     */
    @Test
    public void testGetHallsFor() {
        System.out.println("getHallsFor");
        String film = "";
        String date = "";
        String time = "";
        ManageShowtimesController instance = new ManageShowtimesController();
        List<String> expResult = null;
        List<String> result = instance.getHallsFor(film, date, time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addShowtime method, of class ManageShowtimesController.
     */
    @Test
    public void testAddShowtime() {
        System.out.println("addShowtime");
        String film = "";
        String date = "";
        String time = "";
        String hall = "";
        int availableSeats = 0;
        ManageShowtimesController instance = new ManageShowtimesController();
        boolean expResult = false;
        boolean result = instance.addShowtime(film, date, time, hall, availableSeats);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
