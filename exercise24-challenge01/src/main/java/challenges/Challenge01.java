/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package challenges;
import java.util.*;

public class Challenge01 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //take input
        System.out.println("Enter 2 lowercase strings");
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

    //assumes both strings are lowercase english letters
    public static boolean isAnagram(String a, String b){
        //store counts for the letters used in each string
        int[] counta = new int[26];
        int[] countb = new int[26];
        for(int i=0;i<a.length();i++){
            counta[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            countb[b.charAt(i)-'a']++;
        }
        //return false if any character counts are not equal
        for(int i=0;i<26;i++){
            if(counta[i]!=countb[i])return false;
        }
        return true;
    }

}