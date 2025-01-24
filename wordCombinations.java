import java.io.*;
import java.util.*;

public class Main {
    public static void combinations(String str, String ans, int index, List<String> result) {
        if (ans.length() > 0) {
            result.add(ans);
        }

        for (int i = index; i < str.length(); i++) {
            combinations(str, ans + str.charAt(i), i + 1, result);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("pr151.dat"));

        int iterThru = scan.nextInt();
        scan.nextLine();

        for (int z = 0; z < iterThru; z++) {
            String permute = scan.nextLine();
            List<String> result = new ArrayList<>();
            combinations(permute, "", 0, result);
            
            for (String comb : result) {
                System.out.println(comb + " ");
            }
            System.out.println();
        }
    }
}
