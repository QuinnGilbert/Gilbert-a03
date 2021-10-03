package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    public void testValidate(){
        assertEquals(0,Solution25.passwordValidator("12345"));
        assertEquals(1,Solution25.passwordValidator(("abcdef")));
        assertEquals(2,Solution25.passwordValidator(("abc123xyz")));
        assertEquals(3,Solution25.passwordValidator(("1337h@xor!")));
    }
}