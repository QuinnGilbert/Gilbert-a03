/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

public class Solution30 {

    public static void main(String[] args) {
        System.out.println(genTable());
    }

    static String genTable(){
        //create double for loop
        //use String.format to space output
        StringBuilder table = new StringBuilder();
        for(int i=1;i<=12;i++){
            for(int j=1;j<=12;j++){
                table.append(String.format("%4d ",i*j));
            }
            table.append("\n");
        }
        return table.toString();
    }

}
