/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

/**
 *
 * @author alexandru
 */
public class MathService {
    public boolean isLeapYear(int year)
    {
        if(year % 4 != 0) return false;
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        return true;
    }
        
}
