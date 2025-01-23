/*General Statement:  Read in a letter and a number.   The number indicates how big the letter triangle should be.   The number indicating the size of the triangle will have a range from 0 to 250.  num>=0 and num<=250

Input:  The first number indicates the number of data sets to follow. Each data set will contain one letter and one number.   All letter input will be uppercase.
 
Data File : pr35.dat
 
Output:   Output the letter triangle specified.
 
Helpful Hints / Assumptions:  none
 
Sample Input :
3
5 A
3 Z
4 C
 
Sample Output :
A
AA
AAA
AAAA
AAAAA
 
Z
ZZ
ZZZ
 
C
CC
CCC
CCCC
*/

import java.util.*;
import java.io.*;

public class brah {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr35.dat"));
    
    int iterThru = scan.nextInt();
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      int sizo = scan.nextInt();
      String repeatedchar = scan.next();
      char skib = repeatedchar.charAt(0);
      
      for (int l = 0; l < sizo; l++) {
        for (int i = 0; i <= l; i++) {
          System.out.print(skib);
        }
        System.out.println();
      }
    }
  }
}
