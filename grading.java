//Problem: You have been asked to help a teacher round grades. If a grade is less than 60, it is not rounded. Otherwise the grade is rounded up to the nearest multiple of 5.

//Input: The first number in the data file represents the number data sets to follow. Each data set will consist of a grade.

//Data file: pr170.dat

//Output: Output the rounded grade.

/*Sample Input:
2
59
63
Output Input:
59
65
*/

import java.io.*;
import java.util.*;

public class grade {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr170.dat"));
    int iterThru = scan.nextInt();
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      int grade = scan.nextInt();
      if (grade < 60) {
        System.out.println(grade);
      } else {
        System.out.println(grade + (5 - (grade % 5)));
      }
    }
    
  }
}
