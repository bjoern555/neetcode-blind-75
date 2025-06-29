package src.com.bjoern.sliding_window;

import java.util.HashSet;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String s = "zxyzxyz";
        System.out.println(lengthOfLongestSubstring(s));

        String s2 = "xxxx";
        System.out.println(lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int l = 0;
        int r = 0;
        HashSet<Character> chars = new HashSet<>();

        while (r <= s.length()-1) {
            if (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            } else {
                chars.add(s.charAt(r));
                r++;
                maxLength = Math.max(maxLength, r-l);
            }
        }

        return maxLength;
    }
}
