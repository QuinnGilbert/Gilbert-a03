/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void testGenPassword(){
        String password = Solution37.genPassword(8,2,2);
        int specials = 0;
        int numbers = 0;
        int letters = 0;
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>='0'&&password.charAt(i)<='9'){
                numbers++;
            }else if(password.charAt(i)>='a'&&password.charAt(i)<='z'||password.charAt(i)>='A'&&password.charAt(i)<='Z'){
                letters++;
            }else{
                specials++;
            }
        }
        assertEquals(2,specials);
        assertEquals(2,numbers);
        assertEquals(4,letters);
    }

}