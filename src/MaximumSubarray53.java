public class MaximumSubarray53 {

    public static void main(String[] args) {
        int[] nums = {-2};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for (int num : nums) {
            sum += num;
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
