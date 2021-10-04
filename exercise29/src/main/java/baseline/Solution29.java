/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;
import java.util.*;
public class Solution29 {
    public static void main(String[] args) {
        //use while loop to keep taking input until correct
        Scanner in = new Scanner(System.in);
        boolean check = true;
        int r = 0;
        do{
            if(!check){
                System.out.println("Sorry. That's not a valid input.");
                check = true;
            }
            System.out.print("What's the rate of return: ");
            String input = in.next();
            //check if input is number
            for(char i:input.toCharArray()){
                if(i<'0'||i>'9'){
                    check = false;
                }
            }
            if(!check)continue;
            r = Integer.parseInt(input);
            if(r==0)check = false;
        }while(!check);
        System.out.println("It will take "+72/r+" years for your investment to double.");
    }
}
