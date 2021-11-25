/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution29 {
    public static void main(String[] args) {
        //use while loop to keep taking input until correct
        Scanner in = new Scanner(System.in);
        String input;
        do{
            System.out.print("What is the rate of return? ");
            input = in.next();
            if(!isValid(input)) System.out.println("Sorry, that's not a valid input");
        }while(!isValid(input));
        System.out.println("It will take "+72/Integer.parseInt(input)+" years for your investment to double.");
    }

    static boolean isValid(String s){
        //test if string is a number and not 0
        try{
            int x = Integer.parseInt(s);
            return x != 0;
        }catch (Exception e){
            return false;
        }
    }

}
