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
public class StringService {
    
    public boolean isPalindrome(String string){
        
        StringBuilder str = new StringBuilder(string);
        str.reverse();
        String finalReversed = new String(str);
        if(string.equals(finalReversed))
            return true;
        return false;
    }
}
