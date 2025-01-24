import java.util.*;
import java.io.*;

public class AceIsAretard {
    public static HashMap<Character, Integer> romanValues = new HashMap<>();

    static {
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }
    
  public static int romantoint(String s) {
    int result = 0, prevValue = 0;
    
    for (int i = s.length() - 1; i >= 0; i--) {
        int currentValue = romanValues.get(s.charAt(i));

        if (currentValue < prevValue) {
            result -= currentValue;
        } else {
            result += currentValue;
        }

        prevValue = currentValue;
    }
    
    return result;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("pr82.dat"));
    
    int iterThru = scan.nextInt();
    
    scan.nextLine();
    
    for (int z = 0; z < iterThru; z++) {
      String guh = scan.nextLine();
      
      System.out.println(romantoint(guh));
    }
  }
}
