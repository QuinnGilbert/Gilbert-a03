/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution35 {

    static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        //add values to an array until empty line
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a name: ");
            String input = in.nextLine();
            if(input.equals("")) break;
            add(input);
        }
        //get random name from list
        System.out.println("The winner is... "+getRandomName());
    }

    static void add(String s){
        names.add(s);
    }

    static Random random = new Random();
    static String getRandomName(){
        return names.get(random.nextInt(names.size()));
    }

}
