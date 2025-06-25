package src.com.bjoern.two_pointers;

public class MostWaterContainers {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1,7,2,5,4,7,3,6 }));
        System.out.println(maxArea(new int[] { 2,2,2 }));
    }

    public static int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            if (heights[l] > heights[r]) {
                maxArea = Math.max(maxArea, (r - l) * Math.min(heights[l], heights[r]));
                r--;
            } else if (heights[l]< heights[r]) {
                maxArea = Math.max(maxArea, (r - l) * Math.min(heights[l], heights[r]));
                l++;
            } else {
                maxArea = Math.max(maxArea, (r - l) * Math.min(heights[l], heights[r]));
                r--;
                l++;
            }
        }

        return maxArea;
    }
}
