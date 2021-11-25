/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution28 {
    public static void main(String[] args) {
        //create array to store values
        int[] values = new int[5];
        //create loop to take input
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Input a number: ");
            values[i] = in.nextInt();
        }
        //print result
        System.out.println(sum(values));
        
    }

    static int sum(int[] arr){
        //add all values in arr
        int sum=0;
        for(int i:arr){
            sum+=arr[i];
        }
        return sum;
    }

}
