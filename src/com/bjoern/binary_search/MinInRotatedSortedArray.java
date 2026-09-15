package src.com.bjoern.binary_search;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[] {3,4,5,6,1,2}));
        System.out.println(findMin(new int[] {1,2,3,4,5}));
        System.out.println(findMin(new int[] {2,3,4,5,1}));
        System.out.println(findMin(new int[] {3,4,5,1,2}));
        System.out.println(findMin(new int[] {4,5,1,2,3}));
        System.out.println(findMin(new int[] {5,1,2,3,4}));
        System.out.println(findMin(new int[] {1}));
        System.out.println(findMin(new int[] {1,2}));
        System.out.println(findMin(new int[] {2,1}));
        System.out.println(findMin(new int[] {2,3,1}));
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        if (nums.length == 1) {
            return nums[left];
        }

        while (true) {
            int mid = (left + right) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid+1;
            }

            if (left == right) {
                return nums[left];
            }
        }
    }
}