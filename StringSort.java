/*
Problem: Write a program that will take in a list of strings, and sort all the characters in each string, so every individual string will have all its characters sorted in ASCII order (all characters will be lowercase).

Input: The first line of the data set is an integer that represents the number of lines that follow. Each of the remaining lines will contain a list of strings to each be sorted.
 
data file: sort.dat
 
Output: Output the list of string with each of them having all the characters in it sorted by ASCII value. 
 
Assumptions: All strings will be separated by spaces.
 
Sample Input:
3
Hello From the Other Side
At Least I Can Say That I Tried
Four Cheese Tortellini With Sausage
 
Sample Output:
Hello Fmor eht Oehrt Sdei
At Laest I Can Say Taht I Tdeir
Foru Ceeehs Teiillnort Whit Saaegsu
*/

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("sort.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      String[] line = scan.nextLine().split(" ");
      
      String fin = "";
      
      for (String b : line) {
        ArrayList<Character> strings = new ArrayList<>();
        String inst = "";
        
        for (int i = 0; i < b.length(); i++) {
          strings.add(b.charAt(i));
        }
        
        Collections.sort(strings);
        
        for (int i = 0; i < strings.size(); i++) {
          inst += strings.get(i);
        }
        
        fin += inst + " ";
      }
      System.out.println(fin);
    }
  }
}
