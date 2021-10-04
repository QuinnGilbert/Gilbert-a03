/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;

public class Solution30 {

    public static void main(String[] args) {
        //create double for loop
        //use printf to space output
        for(int i=1;i<=12;i++){
            for(int j=1;j<=12;j++){
                System.out.printf("%4d ",i*j);
            }
            System.out.println();
        }
    }

}
