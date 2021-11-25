/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void testCalculator(){
        PaymentCalculator calculator = new PaymentCalculator(5000,12d/100,100);
        assertEquals(calculator.calculateMonthsUntilPaidOff(),70);
    }
}