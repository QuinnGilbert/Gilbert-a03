/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    void testIsValid(){
        assertFalse(Solution29.isValid("0"));
        assertFalse(Solution29.isValid("ABC"));
        assertTrue(Solution29.isValid("4"));
    }

}