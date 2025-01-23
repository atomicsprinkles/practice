import java.util.*;
import java.io.*;

public class Main {
 
  public static int traverse(char[][] array, boolean[][] traversed) {
    int[][] possibleTraversals = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    int rows = array.length;
    int cols = array[0].length;
    int cout = 0;
   
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (array[i][j] == '$' && !(traversed[i][j])) {
          traversed[i][j] = true;
          for (int[] travelling : possibleTraversals) {
            
            boolean RowInterval = i + travelling[0] >= 0 && i + travelling[0] < array.length;
            boolean ColInterval = j + travelling[1] >= 0 && j + travelling[1] < array[0].length;
            
            if (RowInterval && ColInterval) {
              if (traversed[i+travelling[0]][j+travelling[1]] == false && array[i + travelling[0]][j+travelling[1]] == '$') {
                traversed[i+travelling[0]][j+travelling[1]] = true;
                cout++;
              }
            }
            
          }          
        }
      }
    }
   
    return cout;
  }
 
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr91.dat"));
    char[][] bigBoy = new char[scan.nextInt()][scan.nextInt()];
    boolean[][] traversed = new boolean[bigBoy.length][bigBoy[0].length];
    
    scan.nextLine();
    for (int i = 0; i < bigBoy.length; i++) {
      char[] bruh = scan.nextLine().toCharArray();
      for (int j = 0; j < bigBoy[0].length; j++) {
        bigBoy[i][j] = bruh[j];
      }
    }
    
    System.out.println("Biggest group of $s is " + traverse(bigBoy, traversed) + ".");
  }
}
