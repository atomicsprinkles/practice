import java.util.*;
import java.io.*;

public class Main {
  public static int stringSum(String[] arr) {
    int sum = 0;
    
    for (String fruh : arr) {
      sum += fruh.length();
    }
    
    return sum;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr76.dat"));
    
    String justifyTHIS = scan.nextLine();
    
    System.out.println("1234567890123456789012345678901234567890");
    
    String underUnjust = "";
    String[] words = justifyTHIS.split("\\s+");
    
    for (int i = 0, lineLength = 0; i < words.length; i++) {
      if (words[i].length() + lineLength >= 40) {
        underUnjust = underUnjust.trim() + "\n" + words[i] + " ";
        lineLength = words[i].length();
        continue;
      }
      
      underUnjust += words[i] + " ";
      lineLength += words[i].length() + 1;
    }
    underUnjust = underUnjust.trim();
    
    String[] lines = underUnjust.split("\n");
    
    for (int f = 0; f < lines.length - 1; f++) {
        String[] broken = lines[f].split("\\s+");
        
        while (stringSum(broken) < 40 - broken.length) {
            for (int i = 0; i < broken.length - 1; i++) {
                broken[i] += " ";
                // if (stringSum(broken) > 40 - broken.length) {
                //     break;
                // }
            }
        }
    
        String fin = "";
        for (String brah : broken) {
            fin += brah + " ";
        }
    
        lines[f] = fin.trim();
    }

    for (String s : lines) {
      System.out.print(s + "\n");
    }
  }
}
