package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge01Test {
    @Test
    void testAnagram(){
        assertTrue(Challenge01.isAnagram("note","tone"));
        assertFalse(Challenge01.isAnagram("other","rather"));
    }
}