import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return null;
//    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapping = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mapping.containsKey(complement)) {
                return new int[] {mapping.get(complement), i};
            } else {
                mapping.put(nums[i], i);
            }
        }
        return null;
    }
}
