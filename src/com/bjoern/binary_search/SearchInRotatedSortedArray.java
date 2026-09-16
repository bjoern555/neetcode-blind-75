package src.com.bjoern.binary_search;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[] {3,4,5,6,1,2}, 1));
        System.out.println(search(new int[] {1,2,3,4,5}, 1));
        System.out.println(search(new int[] {2,3,4,5,1}, 1));
        System.out.println(search(new int[] {3,4,5,1,2}, 1));
        System.out.println(search(new int[] {4,5,1,2,3}, 1));
        System.out.println(search(new int[] {5,1,2,3,4}, 1));
        System.out.println(search(new int[] {1}, 1));
        System.out.println(search(new int[] {1,2}, 1));
        System.out.println(search(new int[] {2,1}, 1));
        System.out.println(search(new int[] {2,3,1}, 1));
        System.out.println(search(new int[] {2,3,1}, 2));
        System.out.println(search(new int[] {1,2,3}, 2));
        System.out.println(search(new int[] {2,3,1}, 2));
        System.out.println(search(new int[] {3,1,2}, 2));
        System.out.println(search(new int[] {1,2}, 0));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (true) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[right] == target) {
                return right;
            }

            if (left == right) {
                return -1;
            }

            if (nums[mid] < nums[right]) {
                if (nums[mid] < target && target < nums[right]) {
                    left = mid+1;
                } else {
                    right = mid;
                }
            } else {
                if (nums[right] < target && target < nums[mid]) {
                    right = mid;
                } else {
                    left = mid+1;
                }
            }
        }
    }
}