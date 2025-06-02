package src.com.bjoern.arrays_hashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 1};
        System.out.println(hasDuplicate(nums));

        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(hasDuplicate(nums2));
    }

    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }

        return false;
    }
}
