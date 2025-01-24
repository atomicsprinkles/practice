import java.io.*;
import java.util.*;

public class skibidiSigma {
    public static String sorter(String brah) {
        char[] needSort = brah.toCharArray();
        Arrays.sort(needSort);
        return new String(needSort);
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("anagrams.dat"));
        int iterthru = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < iterthru; i++) {
            String Line = scan.nextLine();
            Scanner lineLOL = new Scanner(Line);

            Map<String, ArrayList<String>> alive = new LinkedHashMap<>();

            while (lineLOL.hasNext()) {
                String arr = lineLOL.next();
                String sortedKey = sorter(arr);
                alive.putIfAbsent(sortedKey, new ArrayList<>());
                alive.get(sortedKey).add(arr);
            }

           String output = "[";
            boolean firstGroup = true;

            for (ArrayList<String> group : alive.values()) {
                if (!firstGroup) {
                    output += ", ";
                }
                output += "[";
                for (int k = 0; k < group.size(); k++) {
                    output += group.get(k);
                    if (k < group.size() - 1) {
                        output += ", ";
                    }
                }
                output += "]";
                firstGroup = false;
            }
            output += "]";
            System.out.println(output);
        }
    }
}
