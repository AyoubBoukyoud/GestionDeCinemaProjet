/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controller;

import java.util.List;
import model.Movie;
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
public class ManageMoviesControllerTest {
    
    public ManageMoviesControllerTest() {
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
     * Test of getAllMovies method, of class ManageMoviesController.
     */
    @Test
    public void testGetAllMovies() throws Exception {
        System.out.println("getAllMovies");
        ManageMoviesController instance = new ManageMoviesController();
        List<Movie> expResult = null;
        List<Movie> result = instance.getAllMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMovie method, of class ManageMoviesController.
     */
    @Test
    public void testAddMovie() {
        System.out.println("addMovie");
        String title = "";
        String genre = "";
        int duration = 0;
        String releaseDate = "";
        String posterPath = "";
        ManageMoviesController instance = new ManageMoviesController();
        boolean expResult = false;
        boolean result = instance.addMovie(title, genre, duration, releaseDate, posterPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMovie method, of class ManageMoviesController.
     */
    @Test
    public void testUpdateMovie() {
        System.out.println("updateMovie");
        int id = 0;
        String title = "";
        String genre = "";
        int duration = 0;
        String releaseDate = "";
        String posterPath = "";
        ManageMoviesController instance = new ManageMoviesController();
        boolean expResult = false;
        boolean result = instance.updateMovie(id, title, genre, duration, releaseDate, posterPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMovie method, of class ManageMoviesController.
     */
    @Test
    public void testDeleteMovie() {
        System.out.println("deleteMovie");
        int id = 0;
        ManageMoviesController instance = new ManageMoviesController();
        boolean expResult = false;
        boolean result = instance.deleteMovie(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
