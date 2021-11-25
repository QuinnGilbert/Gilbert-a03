/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input password
        System.out.print("Input your password: ");
        String password = in.next();
        //get value from interpreter
        int strengthValue = passwordValidator(password);
        //interpret value
        String strength = "";
        if(strengthValue==0)strength = "very weak password.";
        if(strengthValue==1)strength = "weak password.";
        if(strengthValue==2)strength = "strong password.";
        if(strengthValue==3)strength = "very strong password.";
        if(strengthValue==-1)strength = "password of unknown strength";
        //print result
        System.out.println("The password \""+password+"\" is a "+strength);
    }

    static int passwordValidator(String s){
        //count letters, numbers and special
        int letters = 0;
        int numbers = 0;
        boolean special = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                numbers++;
            }else if((s.charAt(i)<='z'&&s.charAt(i)>='a')||(s.charAt(i)<='Z'&&s.charAt(i)>='A')){
                letters++;
            }else{
                special = true;
            }
        }
        //call in other function to reduce cognitive complexity
        return getValue(s,numbers,letters,special);
    }

    static int getValue(String s,int numbers, int letters, boolean special){
        //return 0 for weak and 3 for very strong
        if(numbers==s.length()&&s.length()<8){
            return 0;
        }
        if(letters==s.length()&&s.length()<8){
            return 1;
        }
        if(letters>0&&numbers>0&&s.length()>=8&&!special){
            return 2;
        }
        if(letters>0&&numbers>0&&s.length()>=8){
            return 3;
        }
        //return -1 for other
        return -1;
    }

}
