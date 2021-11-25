/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution27 {

    public static void main(String[] args) {
        //input values
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first= in.nextLine();
        System.out.print("Enter last name: ");
        String last = in.nextLine();
        System.out.print("Enter zip code: ");
        String zip = in.nextLine();
        System.out.print("Enter employee ID: ");
        String id = in.nextLine();
        //call validation function with values
        String result = validateInput(first,last,zip,id);
        System.out.println(result);
    }

    static String validateInput(String first, String last, String zip, String id){
        boolean none = true;
        String result = "";
        if(!checkFirstName(first)){
            none = false;
            result+=("First name must be filled in\n");
        }
        if(!checkLastName(last)){
            none = false;
            result+=("Last name must be filled in\n");
        }
        if(!checkFirstNameLength(first)){
            none = false;
            result+=("The first name must be at least 2 characters long.\n");
        }
        if(!checkLastNameLength(last)){
            none = false;
            result+=("The last name must be at least 2 characters long.\n");
        }
        if(!checkID(id)){
            none = false;
            result+=("The employee ID must be in the format of AA-1234.\n");
        }
        if(!checkZIP(zip)){
            none = false;
            result+="The zipcode must be a 5 digit number.\n";
        }
        if(none){
            return "There were no errors found\n";
        }
        return result;
        //call each function and print appropriate output
    }
    static boolean checkFirstName(String first){
        //return true if string is not empty
        return !first.equals("");
    }
    static boolean checkLastName(String last){
        //return true if string is not empty
        return !last.equals("");
    }
    static boolean checkFirstNameLength(String first){
        //return true if longer than 2
        return first.length()>=2;
    }
    static boolean checkLastNameLength(String last){
        //return true if longer than 2
        return last.length()>=2;
    }
    static boolean checkID(String id){
        //return true if in format AA-1234
        if(id.length()!=7)return false;
        if(!(id.charAt(0)>='A'&&id.charAt(0)<='Z'||id.charAt(0)<='z'&&id.charAt(0)>='a')) return false;
        if(!(id.charAt(1)>='A'&&id.charAt(1)<='Z'||id.charAt(1)<='z'&&id.charAt(1)>='a')) return false;
        if(id.charAt(2)!='-')return false;
        for(int i=3;i<=6;i++){
           if(id.charAt(i)<'0'||id.charAt(i)>'9')return false;
        }
        return true;
    }
    static boolean checkZIP(String zip){
        //return true if zip is a number
        for(int i=0;i<zip.length();i++){
            if(zip.charAt(i)<'0'||zip.charAt(i)>'9')return false;
        }
        return true;
    }


}
