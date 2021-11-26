/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;
import java.util.*;
public class Solution40 {

    static String fname = "First Name";
    static String lname = "Last Name";
    static String pos = "Position";
    static String date = "Separation Date";
    static List<Map<String,String>> data = new ArrayList<>();
    public static void main(String[] args) {
        //generate table
        genTable();
        //prompt and input search string
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search = in.next();
        //get searched table
        System.out.println(searchTable(search));
    }

    static void genTable(){
        //generate data from table given in decription
        Map<String,String> entry1 = Map.of(fname,"John",lname,"Johnson",pos,"Manager",date,"2016-12-31");
        Map<String,String> entry2 = Map.of(fname,"Tou",lname,"Xiong",pos,"Software Engineer",date,"2016-10-05");
        Map<String,String> entry3 = Map.of(fname,"Michaela",lname,"Michaelson",pos,"District Manager",date,"2015-12-19");
        Map<String,String> entry4 = Map.of(fname,"Jake",lname,"Jacobson",pos,"Programmer",date,"");
        Map<String,String> entry5 = Map.of(fname,"Jacquelyn",lname,"Jackson",pos,"DBA",date,"");
        Map<String,String> entry6 = Map.of(fname,"Sally",lname,"Webber",pos,"Web Developer",date,"2015-12-18");
        data.add(entry1);
        data.add(entry2);
        data.add(entry3);
        data.add(entry4);
        data.add(entry5);
        data.add(entry6);
    }

    static String searchTable(String search){
        //return table String of searched elements in table
        StringBuilder table = new StringBuilder();
        table.append(String.format("%-20s|%-20s|%-20s","Name","Position","Separation Date"));
        table.append("\n");
        table.append("--------------------|--------------------|--------------------");
        table.append("\n");
        for(Map<String,String> i: data){
            if(i.get("First Name").contains(search)||i.get("Last Name").contains(search)){
                table.append(String.format("%-20s|%-20s|%-20s",i.get(fname)+" "+i.get(lname),i.get(pos),i.get(date)));
                table.append("\n");
            }
        }
        return table.toString();
    }

}
