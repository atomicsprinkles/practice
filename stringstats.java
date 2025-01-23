/*Problem: Write a program that will provide statistics to the author of a word processing paper. The statistics needed are: the number of vowels, the number of consonants, the number of spaces, the number of other characters that are non-alphabetic and not a space, the number of words, the length of the longest word, the length of the shortest word, and the average length of a word rounded to tenths. 

Input: A paragraph of text.
 
Data File: pr75.dat
 
Output: Output the statistics in the format given below. All numbers are right justified under their heading. 
 
Assumptions: The paper is one paragraph long. A word is one or more characters surrounded by a space. There will not be two consecutive spaces in the text.
 
Sample Input:

Sample Output:
VOWELS – 46 
CONSONANTS – 78
SPACES – 39
OTHER - 13
WORDS - 40
LONGEST - 11
SHORTEST - 1
AVERAGE – 3.4
*/

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr75.dat"));
    String bruh = scan.nextLine();
    
    int vowelCount = bruh.length() - bruh.replaceAll("[aeiouAEIOU]+", "").length();
    int consonantCount = bruh.length() - bruh.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]+" , "").length();
    int spaceCount = bruh.length() - bruh.replaceAll("[\s]+", "").length();
    int other = bruh.length() - bruh.replaceAll("[^\sbcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZaeiouAEIOU]+", "").length();
    
    String[] bruh2 = bruh.split(" ");
    int shortest = bruh2[0].length(), longest = bruh2[0].length();
    double sum = 0.0;
    
    for (String c : bruh2) {
      if (shortest > c.length())
        shortest = c.length();
      else if (longest < c.length())
        longest = c.length();
        
      sum += c.length();
    }

    System.out.println("VOWELS - " + vowelCount + "\nCONSONANTS - " + consonantCount + "\nSPACE - " + spaceCount + "\nOTHER - " + other + "\nWORDS - " + bruh2.length + "\nLONGEST - " + longest + "\nSHORTEST - " + shortest + "\nAVERAGE - " + String.format("%.1f", (sum / bruh2.length)));
  }
}
