package Medium;
import java.util.*;
class TwoSum {
    public int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (hashmap.containsKey(difference)) {
                return new int[] { hashmap.get(difference), i };
            }

            hashmap.put(nums[i], i);
        }

        return new int[] {}; 
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 7;

        TwoSum solution = new TwoSum();
        int[] result = solution.findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
