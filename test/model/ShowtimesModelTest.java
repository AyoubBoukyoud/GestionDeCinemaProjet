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
public class ShowtimesModelTest {
    
    public ShowtimesModelTest() {
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
     * Test of fetchMovies method, of class ShowtimesModel.
     */
    @Test
    public void testFetchMovies() {
        System.out.println("fetchMovies");
        List<String> expResult = null;
        List<String> result = ShowtimesModel.fetchMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchDates method, of class ShowtimesModel.
     */
    @Test
    public void testFetchDates() {
        System.out.println("fetchDates");
        String film = "";
        List<String> expResult = null;
        List<String> result = ShowtimesModel.fetchDates(film);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchTimes method, of class ShowtimesModel.
     */
    @Test
    public void testFetchTimes() {
        System.out.println("fetchTimes");
        String film = "";
        String date = "";
        List<String> expResult = null;
        List<String> result = ShowtimesModel.fetchTimes(film, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchHalls method, of class ShowtimesModel.
     */
    @Test
    public void testFetchHalls() {
        System.out.println("fetchHalls");
        String film = "";
        String date = "";
        String time = "";
        List<String> expResult = null;
        List<String> result = ShowtimesModel.fetchHalls(film, date, time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertShowtime method, of class ShowtimesModel.
     */
    @Test
    public void testInsertShowtime() {
        System.out.println("insertShowtime");
        String film = "";
        String date = "";
        String time = "";
        String hall = "";
        int availableSeats = 0;
        boolean expResult = false;
        boolean result = ShowtimesModel.insertShowtime(film, date, time, hall, availableSeats);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
