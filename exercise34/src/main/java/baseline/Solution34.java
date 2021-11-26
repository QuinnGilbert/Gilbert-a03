/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution34 {

    static ArrayList<String> list;
    public static void main(String[] args) {
        //create initial list
        genList();
        //print list
        printList();
        //prompt and input employee to remove
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an employee name to remove: ");
        String name = in.nextLine();
        //remove employee
        remove(name);
        //print list
        printList();
    }

    static void genList(){
        //create initial list
        list = new ArrayList<>();
        list.add("Quinn Gilbert");
        list.add("Seba Villalobos");
        list.add("David Santamaria");
        list.add("Daniel West");
        list.add("Glenn Martin");
    }

    static void printList(){
        System.out.println("There are "+list.size()+" employees");
        for(String i:list){
            System.out.println(i);
        }
    }

    static void remove(String employee){
        //remove employee from list
        list.remove(employee);
    }

}
