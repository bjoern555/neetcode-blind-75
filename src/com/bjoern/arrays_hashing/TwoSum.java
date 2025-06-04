package src.com.bjoern.arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{5,5};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        int[] nums2 = new int[]{1,2,6,3};
        int target2 = 5;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
