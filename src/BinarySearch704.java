public class BinarySearch704 {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return binSearch(0, nums.length - 1, nums, target);
    }

    private static int binSearch(int l, int r, int[] nums, int target) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (target < nums[mid]) {
                return binSearch(l, mid - 1, nums, target);
            }
            if (target > nums[mid]) {
                return binSearch(mid + 1, r, nums, target);
            }
            return mid;
        }
        return -1;
    }
}
