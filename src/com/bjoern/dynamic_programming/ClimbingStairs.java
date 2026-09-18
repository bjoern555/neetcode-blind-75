package src.com.bjoern.dynamic_programming;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(numStairs(0));
        System.out.println(numStairs(1));
        System.out.println(numStairs(2));
        System.out.println(numStairs(3));
        System.out.println(numStairs(4));
        System.out.println(numStairs(5));
        System.out.println(numStairs(10));
    }

    public static int numStairs(int n) {
        if (n <= 2) {
            return n; 
        }

        int[] memo = new int[n+1];
        return rec(n-1, memo) + rec(n-2, memo);
    }

    private static int rec(int n, int[] memo) {
        if (n <= 2) {
           return n; 
        }

        if (memo[n] > 0) {
            return memo[n];
        }
        
        int sol = rec(n-1, memo) + rec(n-2, memo);
        memo[n] = sol;
        return sol;
    }
}