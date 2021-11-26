/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution36 {

    public static void main(String[] args) {
        //keep entering numbers and adding them to list until done
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            System.out.print("Enter a number: ");
            String s = in.next();
            if(s.equals("done"))break;
            if(isValid(s))list.add(Integer.parseInt(s));
        }
        //get and print average, min, max, and std dev
        System.out.println("The average is "+getAverage(list));
        System.out.println("The maximum is "+getMax(list));
        System.out.println("The minimum is "+getMin(list));
        System.out.println("The standard deviation is "+getStdDev(list));
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

    static int getMax(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i:list){
            max = Math.max(max,i);
        }
        return max;
    }

    static int getMin(ArrayList<Integer> list){
        int min = list.get(0);
        for(int i:list){
            min = Math.min(min,i);
        }
        return min;
    }

    static double getAverage(ArrayList<Integer> list){
        int sum = 0;
        for(int i:list){
            sum+=i;
        }
        return sum/(double)list.size();
    }

    static double getStdDev(ArrayList<Integer> list){
        double mean = getAverage(list);
        double sum = 0;
        for(int i:list){
            sum+=(i-mean)*(i-mean);
        }
        return Math.sqrt(sum/list.size());
    }
}
