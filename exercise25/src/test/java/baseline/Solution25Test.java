/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    void testValidate(){
        assertEquals(0,Solution25.passwordValidator("12345"));
        assertEquals(1,Solution25.passwordValidator(("abcdef")));
        assertEquals(2,Solution25.passwordValidator(("abc123xyz")));
        assertEquals(3,Solution25.passwordValidator(("1337h@xor!")));
    }
}