package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    @Test
    public void testAll(){
        assertTrue(Solution27.checkFirstName("J"));
        assertFalse(Solution27.checkLastName(""));
        assertFalse(Solution27.checkFirstNameLength("J"));
        assertFalse(Solution27.checkLastNameLength(""));
        assertFalse(Solution27.checkID("A12-1234"));
        assertFalse(Solution27.checkZIP("ABCDE"));

        assertTrue(Solution27.checkFirstName("John"));
        assertTrue(Solution27.checkLastName("Johnson"));
        assertTrue(Solution27.checkFirstNameLength("John"));
        assertTrue(Solution27.checkLastNameLength("Johnson"));
        assertTrue(Solution27.checkID("TK-4321"));
        assertTrue(Solution27.checkZIP("55555"));
    }
}