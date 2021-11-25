package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    void testSum(){
        int[] testArray = {1,2,3,4,5};
        assertEquals(15,Solution28.sum(testArray));
    }
}