/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution33 {

    public static void main(String[] args) {
        //prompt question and wait for input
        Scanner in = new Scanner(System.in);
        System.out.print("What is your question?\n>");
        in.nextLine();
        //get and output random response
        System.out.println(getResponse());
    }

    static Random random = new Random();
    static String getResponse(){
        //store responses
        String[] responses = {"Yes","No","Maybe","Ask again later."};
        //get random number
        int index = random.nextInt(responses.length);
        //return corresponding response
        return responses[index];
    }

}
