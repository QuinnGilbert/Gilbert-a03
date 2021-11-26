/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void testTable(){
        String correct = """
                Name                |Position            |Separation Date    \s
                --------------------|--------------------|--------------------
                Jacquelyn Jackson   |DBA                 |                   \s
                Jake Jacobson       |Programmer          |                   \s
                John Johnson        |Manager             |2016-12-31         \s
                Michaela Michaelson |District Manager    |2015-12-19         \s
                Sally Webber        |Web Developer       |2015-12-18         \s
                Tou Xiong           |Software Engineer   |2016-10-05         \s
                """;
        Solution39.genTable();
        assertEquals(correct,Solution39.getSortedData());
    }

}