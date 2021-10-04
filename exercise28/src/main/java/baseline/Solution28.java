/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;
import java.util.*;
public class Solution28 {
    public static void main(String[] args) {
        //create variable to store sum
        int sum=0;
        //create loop to take input
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Input a number: ");
            sum+=in.nextInt();
        }
        //print result
        System.out.println(sum);
        
    }
}
