/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;
import java.util.*;
public class Solution31 {

    public static void main(String[] args) {
        //input age and resting heart rate
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.print("Enter resting heart rate: ");
        int resting = in.nextInt();
        //loop through intensities
        //Target = (((220 − age) − restingHR) × intensity) + restingHR
        System.out.println("Intensity| Rate");
        System.out.println("---------------");
        for(int i=55;i<=95;i++){
            double BPM = ((220-age)-resting)*i/100.0 + resting;
            System.out.println(i+"%      | "+BPM+" bpm");
        }
    }

}
