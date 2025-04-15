/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

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
public class TicketModelTest {
    
    public TicketModelTest() {
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
     * Test of fetchMovies method, of class TicketModel.
     */
    @Test
    public void testFetchMovies() throws Exception {
        System.out.println("fetchMovies");
        List<String> expResult = null;
        List<String> result = TicketModel.fetchMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchShowtimes method, of class TicketModel.
     */
    @Test
    public void testFetchShowtimes() throws Exception {
        System.out.println("fetchShowtimes");
        String filmTitle = "";
        List<String> expResult = null;
        List<String> result = TicketModel.fetchShowtimes(filmTitle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTicket method, of class TicketModel.
     */
    @Test
    public void testInsertTicket() throws Exception {
        System.out.println("insertTicket");
        int showtimeId = 0;
        String customer = "";
        String seat = "";
        String type = "";
        double price = 0.0;
        TicketModel.insertTicket(showtimeId, customer, seat, type, price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
