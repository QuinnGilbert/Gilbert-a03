/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain="y";
        //loop as long as player says "y"
        while(playAgain.equals("y")){
            promptGame(in);
            System.out.print("\nDo you want to play again? ");
            playAgain = in.next();
        }
    }

    static void promptGame(Scanner in){
        //give prompts for input based on previous number
        System.out.print("Let's play guess the number!\nEnter your difficulty level (1,2,3): ");
        int difficulty = in.nextInt();
        int value = generate(difficulty);
        int guesses = 0;
        boolean guessed = false;
        while(!guessed){
            System.out.print("Guess a number: ");
            int guess = -1;
            String s = in.next();
            if(isValid(s)) guess = Integer.parseInt(s);
            guesses++;
            if(guess==value){
                guessed = true;
            }else{
                if(!isValid(s)){
                    System.out.println("You must guess a number");
                }else{
                    if(guess<value){
                        System.out.println("Too low!");
                    }else{
                        System.out.println("Too high!");
                    }
                }
            }
        }
        System.out.println("You got it in "+guesses+" guesses!");
    }

    //generate a random number in the proper bounds
    static Random random = new Random();
    static int generate(int difficulty){
        if(difficulty==1){
            return random.nextInt(10)+1;
        }
        if(difficulty==2){
            return random.nextInt(100)+1;
        }
        return random.nextInt(1000)+1;

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

}
