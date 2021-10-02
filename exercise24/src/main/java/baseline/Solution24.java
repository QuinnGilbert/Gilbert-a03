/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;

public class Solution24 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //take input
        System.out.print("Enter the first string: ");
        String string1 = in.next();
        System.out.print("Enter the second string: ");
        String string2 = in.next();
        //check if anagram and print output
        System.out.printf("\"%s\" and \"%s\" are ",string1,string2);
        if(isAnagram(string1,string2)){
            System.out.println("anagrams");
        }else{
            System.out.println("not anagrams");
        }
    }

    public static boolean isAnagram(String a, String b){
        //change strings to char[] so that they can be sorted easily
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        //sort the strings so that the arrays will be equal if they are anagrams
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        //return whether the arrays are equal
        return Arrays.toString(arrayA).equals(Arrays.toString(arrayB));
    }

}
