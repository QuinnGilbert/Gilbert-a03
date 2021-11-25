/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution31 {

    public static void main(String[] args) {
        //input age and resting heart rate
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        String input = in.next();
        while(!isValid(input)){
            input = in.next();
            if(!isValid(input)){
                System.out.println("input must be a number");
            }
        }
        int age = Integer.parseInt(input);
        System.out.print("Enter resting heart rate: ");
        input = in.next();
        while(!isValid(input)){
            input = in.next();
            if(!isValid(input)){
                System.out.println("input must be a number");
            }
        }
        int resting = Integer.parseInt(input);
        //Target = (((220 − age) − restingHR) × intensity) + restingHR
        System.out.println(getTable(age,resting));

    }

    static String getTable(int age, int resting){
        StringBuilder table = new StringBuilder();
        table.append("Intensity| Rate\n");
        table.append("---------------\n");
        //loop through intensities
        for(int i=55;i<=95;i+=5){
            double bpm = ((220-age)-resting)*(i/100.0) + resting;
            table.append(String.format("%d%%   | %.0f bpm",i,bpm));
            table.append("\n");
        }
        return table.toString();
    }

    static boolean isValid(String s){
        //test if string is a number
        try{
            Integer.parseInt(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
