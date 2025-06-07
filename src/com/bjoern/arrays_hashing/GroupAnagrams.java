package src.com.bjoern.arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        System.out.println(Arrays.toString(strs));
        System.out.println(groupAnagrams(strs) + "\n");

        String[] strs2 = new String[]{"x"};
        System.out.println(Arrays.toString(strs2));
        System.out.println(groupAnagrams(strs2) + "\n");

        String[] strs3 = new String[]{""};
        System.out.println(Arrays.toString(strs3));
        System.out.println(groupAnagrams(strs3) + "\n");
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<HashMap<Character, Integer>,Integer> map = new HashMap<>();

        for (String s : strs) {
            HashMap<Character, Integer> wordMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                wordMap.put(s.charAt(i), wordMap.getOrDefault(s.charAt(i), 0) + 1);
            }

            if (map.containsKey(wordMap)) {
                result.get(map.get(wordMap)).add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                result.add(newList);
                map.put(wordMap, result.size() - 1);
            }
        }

        return result;
    }
}
