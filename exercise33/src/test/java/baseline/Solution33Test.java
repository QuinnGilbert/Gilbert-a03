/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    void testGetResponse(){
        //Run many times to test random
        for(int i=0;i<100;i++){
            String s = Solution33.getResponse();
            assertTrue(s.equals("Yes")||s.equals("No")||s.equals("Maybe")||s.equals("Ask again later."));
        }
    }
}