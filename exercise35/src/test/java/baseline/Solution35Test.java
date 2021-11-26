/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void testAdd(){
        Solution35.add("TestString");
        assertTrue(Solution35.names.contains("TestString"));
    }

    @Test
    void testGetRandomName(){
        Solution35.add("Quinn");
        Solution35.add("David");
        Solution35.add("Jacob");
        assertTrue(Solution35.names.contains(Solution35.getRandomName()));
    }

}