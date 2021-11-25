/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    void testIsValid(){
        assertTrue(Solution31.isValid("22"));
        assertFalse(Solution31.isValid("ABC"));
    }
    @Test
    void testGetTable(){
        String correctTable = """
                Intensity| Rate
                ---------------
                55%   | 138 bpm
                60%   | 145 bpm
                65%   | 151 bpm
                70%   | 158 bpm
                75%   | 165 bpm
                80%   | 171 bpm
                85%   | 178 bpm
                90%   | 185 bpm
                95%   | 191 bpm
                """;
        assertEquals(correctTable,Solution31.getTable(22,65));
    }
}