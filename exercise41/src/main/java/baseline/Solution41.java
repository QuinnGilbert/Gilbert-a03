/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

//Sortable class to store names
class Person implements Comparable<Person>{
    String first;
    String last;
    public int compareTo(Person b){
        return first.compareTo(b.first);
    }
}

public class Solution41 {
    public static void main(String[] args) {
        //input and parse data
        //sort data
        //print data
    }
}
