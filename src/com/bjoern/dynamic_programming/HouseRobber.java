package src.com.bjoern.dynamic_programming;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,3,3,1}));
        System.out.println(rob(new int[]{2,9,8,3,6}));
        System.out.println(rob(new int[]{0}));
        System.out.println(rob(new int[]{1}));
    }

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        if (length == 1) {
            return nums[0];
        }

        nums[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < length; i++) {
            nums[i] = Math.max(nums[i-2] + nums[i], nums[i-1]);
        }
        return nums[length-1];
    }
}