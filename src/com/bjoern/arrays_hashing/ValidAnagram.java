package src.com.bjoern.arrays_hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "xx";
        String t = "x";
        System.out.println(isAnagram(s,t));

        String s1 = "abc";
        String s2 = "cba";
        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) > 1) {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                } else {
                    map.remove(t.charAt(i));
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
}
