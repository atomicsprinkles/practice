import java.io.*;
import java.util.*;

public class Main {
    public static boolean canAchieveTarget(int[] arr, int n, int target) {
        if (target == 0) return true;
        if (n == 0) return false;

        boolean exclude = canAchieveTarget(arr, n - 1, target);

        boolean include = false;
        if (arr[n - 1] <= target) {
            include = canAchieveTarget(arr, n - 1, target - arr[n - 1]);
        }

        return exclude || include;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("pr154.dat"));
        int testCases = scan.nextInt();
        scan.nextLine();
        for (int t = 0; t < testCases; t++) {
            int target = scan.nextInt();
            scan.nextLine();
            String[] numbersStr = scan.nextLine().split("\\s+");
            int[] numbers = Arrays.stream(numbersStr).mapToInt(Integer::parseInt).toArray();

            if (canAchieveTarget(numbers, numbers.length, target)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
