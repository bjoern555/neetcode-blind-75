package src.com.bjoern.sliding_window;

public class BuySellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {10,1,5,6,7,1}));
        System.out.println(maxProfit(new int[] {10,8,7,5,2}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 100;
        int maxPrice = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
                maxPrice = 0;
            } else {
                maxPrice = Math.max(maxPrice, price);
            }
            maxProfit = Math.max(maxProfit, maxPrice - minPrice);
        }
        return maxProfit;
    }
}
