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
public class CaissierControllerTest {
    
    public CaissierControllerTest() {
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
     * Test of getAllMovies method, of class CaissierController.
     */
    @Test
    public void testGetAllMovies() throws Exception {
        System.out.println("getAllMovies");
        CaissierController instance = new CaissierController();
        List<String> expResult = null;
        List<String> result = instance.getAllMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShowtimesFor method, of class CaissierController.
     */
    @Test
    public void testGetShowtimesFor() throws Exception {
        System.out.println("getShowtimesFor");
        String filmTitle = "";
        CaissierController instance = new CaissierController();
        List<String> expResult = null;
        List<String> result = instance.getShowtimesFor(filmTitle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeatTypes method, of class CaissierController.
     */
    @Test
    public void testGetSeatTypes() {
        System.out.println("getSeatTypes");
        CaissierController instance = new CaissierController();
        List<String> expResult = null;
        List<String> result = instance.getSeatTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookTicket method, of class CaissierController.
     */
    @Test
    public void testBookTicket() {
        System.out.println("bookTicket");
        int showtimeId = 0;
        String customerName = "";
        String seat = "";
        String seatType = "";
        CaissierController instance = new CaissierController();
        boolean expResult = false;
        boolean result = instance.bookTicket(showtimeId, customerName, seat, seatType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildTicketText method, of class CaissierController.
     */
    @Test
    public void testBuildTicketText() {
        System.out.println("buildTicketText");
        String film = "";
        String showtimeInfo = "";
        String customer = "";
        String seatType = "";
        String seat = "";
        double price = 0.0;
        CaissierController instance = new CaissierController();
        String expResult = "";
        String result = instance.buildTicketText(film, showtimeInfo, customer, seatType, seat, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTicket method, of class CaissierController.
     */
    @Test
    public void testPrintTicket() throws Exception {
        System.out.println("printTicket");
        String ticketText = "";
        CaissierController instance = new CaissierController();
        instance.printTicket(ticketText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
