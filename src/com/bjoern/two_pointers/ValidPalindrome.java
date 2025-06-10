package src.com.bjoern.two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));

        String s2 = "tab a cat";
        System.out.println(isPalindrome(s2));

        String s3 = "tab a bat";
        System.out.println(isPalindrome(s3));

        String s4 = "tab bat";
        System.out.println(isPalindrome(s4));

        String s5 = "";
        System.out.println(isPalindrome(s5));

        String s6 = "a";
        System.out.println(isPalindrome(s6));

        String s7 = "%";
        System.out.println(isPalindrome(s7));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (l < r && Character.toUpperCase(s.charAt(l)) != Character.toUpperCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
