/*
General Statement :  This program reads in values from the data file and determines the number of modes occurring in the data set.  A mode is the data element in the set that occurs most frequently.  Read in each data set and determine how many modes occur.

Input:  The first number in the data file represents the number of data sets to follow.  Each data set will have an unknown amount of numbers that range from 0 to 100, including 0 and 100.  
 
Data File : pr50.dat
 
Output:  Output the number of modes in the each data set.  
 
Helpful Hints / Assumptions : Every data set will have at least one mode.
 
Sample Input :
2
56 77 66 22 33 55 66 66 66 
80 93 87 72 80 77 43 87 98 99 100 
 
Sample Output : 
1 MODE
2 MODES
*/

import java.io.*;
import java.util.*;

public class SETHSMELLS {
  public static void main(String[] args) throws IOException {
    
    Scanner scan = new Scanner(new File("pr50.dat"));
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    for (int i = 0; i < iterThru; i++){
      String[] buh = scan.nextLine().split(" ");
      int[] bruh = new int[buh.length];
      for (int x = 0; x < buh.length; x++) {
        bruh[x] = Integer.parseInt(buh[x]);
      }
      
      HashMap<Integer, Integer> objects = new HashMap<Integer, Integer>();
      
      for (int j : bruh) {
        
        if (objects.containsKey(j)) {
          objects.put(j, objects.get(j) + 1);
        } else {
            objects.put(j, 0);
        }
      }
      int modes = 0;
      int max = 0;
      
      for (Map.Entry<Integer, Integer> entry : objects.entrySet()) {
          int count = entry.getValue();
          if (count > max) {
              max = count;
          }
      }
      
      for (Map.Entry<Integer, Integer> entry : objects.entrySet()) {
          int count = entry.getValue();
          
          if (count == max) {
              modes++;
          }
      }
      
      if (modes == 1) {
        System.out.println(modes + " MODE");
      } else if (modes > 1 && modes > 0) {
        System.out.println(modes + " MODES");
      }
    }
  }
}
