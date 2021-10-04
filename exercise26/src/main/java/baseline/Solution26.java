/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;
import java.util.*;
public class Solution26 {
    public static void main(String[] args) {
        //input values
        Scanner in = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)?");
        double APR = in.nextDouble()/100;
        System.out.print("What is the monthly payment you can make?");
        double payment = in.nextDouble();
        //create PaymentCalculator with values
        PaymentCalculator calculator = new PaymentCalculator(balance,APR,payment);
        //get number of months
        int months = calculator.calculateMonthsUntilPaidOff();
        //print result
        System.out.println("It will take "+months+" months to pay off this card.");
    }
}
