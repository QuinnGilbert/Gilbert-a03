/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution37 {
    public static void main(String[] args) {
        //prompt and input minlength, special chars, numbers
        Scanner in = new Scanner(System.in);
        System.out.print("What's the min length? ");
        int minLength = in.nextInt();
        System.out.print("How many special characters? ");
        int specialChars = in.nextInt();
        System.out.print("How many numbers? ");
        int numbers = in.nextInt();
        //generate random password
        System.out.println("Your password is "+genPassword(minLength,specialChars,numbers));
    }

    static Random random = new Random();
    static String genPassword(int minLength, int specialChars, int numbers) {
        //randomly get correct number of each value from special list and pad with letters
        char[] special = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] letters = new char[52];
        for(int i=0;i<26;i++) letters[i] = (char)(i+'a');
        for(int i=0;i<26;i++) letters[i+26] = (char)(i+'A');
        int length = Math.max(minLength, 2*(specialChars + numbers));

        char[] password = new char[length];
        //use array list of indexes to get a random place to put each character in string
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i=0;i<length;i++){
            indexes.add(i);
        }
        //add the special characters
        for(int i=0;i<specialChars;i++){
            char c = special[random.nextInt(10)];
            int index = random.nextInt(indexes.size());
            password[indexes.remove(index)] = c;
        }
        for(int i=0;i<specialChars;i++){
            char c = num[random.nextInt(10)];
            int index = random.nextInt(indexes.size());
            password[indexes.remove(index)] = c;
        }
        for(int i:indexes){
            password[i] = letters[random.nextInt(52)];
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<length;i++){
            result.append(password[i]);
        }
        return result.toString();
    }
}
