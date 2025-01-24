/*
Problem: The bitwise AND operation puts two numbers into binary and compares their bits. If both bits are 1 the resulting bit is 1, otherwise the result is 0. Use the bitwise AND operation to modify two numbers.

v = x&y;

Input: The first number in the data file represents the number data sets to follow. Each data set will consist of two numbers, x and y.

Data file: pr160.dat

Output: Output x, y and (x&y) in binary then output (x&y) in base 10.

Assumptions:

*/

import java.io.*;
import java.util.*;

public class Skibidi {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr160.dat"));
    int iterThru = scan.nextInt();
  
    scan.nextLine();
    for (int i = 0; i < iterThru; i++) {
      int[] intArrays = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
      System.out.println(Integer.toBinaryString(intArrays[0]));
      System.out.println(Integer.toBinaryString(intArrays[1]));
      
      int fin = intArrays[0] & intArrays[1];
      System.out.println(Integer.toBinaryString(fin));
      System.out.println(fin);
      
      System.out.println();
    }

  }
}
