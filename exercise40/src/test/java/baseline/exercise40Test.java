/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercise40Test {

    @Test
    void testSearch(){
        String correct = """
                Name                |Position            |Separation Date    \s
                --------------------|--------------------|--------------------
                Jake Jacobson       |Programmer          |                   \s
                Jacquelyn Jackson   |DBA                 |                   \s
                """;
        Solution40.genTable();
        assertEquals(correct,Solution40.searchTable("Jac"));
    }

}