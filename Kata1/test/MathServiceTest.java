/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import kata1.MathService;
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
public class MathServiceTest {
    
    MathService mService;
    
    public MathServiceTest() {
    }
    
    
    @Before
    public void setUp() {
        mService = new MathService();
    }
    
    @After
    public void tearDown() {
        mService = null;
    }
    
    @Test
    public void ShouldBeTrue2000()
    {
        boolean check = mService.isLeapYear(2000);
        assertTrue(check);
    }
    @Test
    public void ShouldBeFalse2010()
    {
        boolean check = mService.isLeapYear(2010);
        assertFalse(check);
    }
    @Test
    public void ShouldBeFalse1800()
    {
        boolean check = mService.isLeapYear(1800);
        assertFalse(check);
    }
     
    @Test
    public void ShouldBeTrue2012()
    {
        boolean check = mService.isLeapYear(2012);
        assertTrue(check);
    }   
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
