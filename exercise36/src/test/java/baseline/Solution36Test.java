/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    @Test
    void testIsValid(){
        assertTrue(Solution36.isValid("22"));
        assertFalse(Solution36.isValid("ABC"));
    }

    @Test
    void testStatistics(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        assertEquals(400,Solution36.getAverage(list));
        assertEquals(1000,Solution36.getMax(list));
        assertEquals(100,Solution36.getMin(list));
        assertEquals(Math.sqrt(125000),Solution36.getStdDev(list));
    }
}