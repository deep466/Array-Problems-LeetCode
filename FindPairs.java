import java.util.HashSet;
import java.util.Set;

public class FindPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5, 6};
        int targetSum = 6;

        Set<Integer> seen = new HashSet<>();
        Set<String> pairs = new HashSet<>();

        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                // Add the pair in a formatted string
                pairs.add("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }

        System.out.println("Pairs with sum " + targetSum + ": " + pairs);
    }
}
