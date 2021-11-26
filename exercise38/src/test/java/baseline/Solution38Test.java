/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void testFilterNumbers(){
        int[] nums = {1,2,3,4,5,6,7,8};
        int[] correct = {2,4,6,8};
        assertArrayEquals(correct,Solution38.filterNumbers(nums));
    }

}