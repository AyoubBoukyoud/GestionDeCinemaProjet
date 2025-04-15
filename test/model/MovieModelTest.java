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
public class MovieModelTest {
    
    public MovieModelTest() {
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
     * Test of fetchAll method, of class MovieModel.
     */
    @Test
    public void testFetchAll() throws Exception {
        System.out.println("fetchAll");
        List<Movie> expResult = null;
        List<Movie> result = MovieModel.fetchAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class MovieModel.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        String title = "";
        String genre = "";
        int duration = 0;
        String releaseDate = "";
        String posterPath = "";
        MovieModel.insert(title, genre, duration, releaseDate, posterPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class MovieModel.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        int id = 0;
        String title = "";
        String genre = "";
        int duration = 0;
        String releaseDate = "";
        String posterPath = "";
        MovieModel.update(id, title, genre, duration, releaseDate, posterPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class MovieModel.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        int id = 0;
        MovieModel.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
