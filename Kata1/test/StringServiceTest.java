/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import kata1.StringService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexandru
 */
public class StringServiceTest {
    
    private StringService service;
    
    public StringServiceTest() {
    }
    
    @Before
    public void setUp() {
        service = new StringService();
    }
    
    @After
    public void tearDown() {
        service = null;
    }
    
    @Test
    public void rolorShouldReturnTrue()
    {
        boolean check = service.isPalindrome("rolor");
        assertTrue(check);
    }
    
    @Test    
    public void colorShouldReturnFalse()
    {
        boolean check = service.isPalindrome("color");
        assertFalse(check);
    }
    
    @Test    
    public void aaaaaShouldReturnTrue()
    {
        boolean check = service.isPalindrome("aaaaa");
        assertTrue(check);
    }
        

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
