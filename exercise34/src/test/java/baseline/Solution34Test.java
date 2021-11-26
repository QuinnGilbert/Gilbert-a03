package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void testGenList(){
        Solution34.genList();
        String[] testList = {"Quinn Gilbert","Seba Villalobos","David Santamaria","Daniel West","Glenn Martin"};
        assertArrayEquals(Solution34.list.toArray(),testList);
    }

    @Test
    void testRemove(){
        Solution34.genList();
        Solution34.remove("Quinn Gilbert");
        assertFalse(Solution34.list.contains("Quinn Gilbert"));
    }

}