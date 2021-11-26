package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void testIsValid(){
        assertTrue(Solution32.isValid("22"));
        assertFalse(Solution32.isValid("ABC"));
    }

    @Test
    void testGenerate(){
        //test the random value by just running it a bunch of times
        for(int i=0;i<1000;i++){
            assertTrue(Solution32.generate(1)<=10);
            assertTrue(Solution32.generate(1)<=100);
            assertTrue(Solution32.generate(1)<=1000);
        }
    }

}