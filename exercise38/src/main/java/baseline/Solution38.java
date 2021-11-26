/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution38 {

    public static void main(String[] args) {
        //prompt and input list of numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers separated by spaces: ");
        String[] input  = in.nextLine().split(" ");
        int[] nums = new int[input.length];
        for(int i=0;i<input.length;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        //get list of only evens from input numbers
        int[] evenNums = filterNumbers(nums);
        System.out.print("The even numbers are: ");
        for(int i:evenNums){
            System.out.print(" "+i);
        }
        System.out.println();
    }

    static int[] filterNumbers(int[] arr){
        //loop through array and add only even numbers
        ArrayList<Integer> evens = new ArrayList<>();
        for(int i:arr){
            if(i%2==0){
                evens.add(i);
            }
        }
        int[] result = new int[evens.size()];
        for(int i=0;i<result.length;i++){
            result[i] = evens.get(i);
        }
        return result;
    }
}
