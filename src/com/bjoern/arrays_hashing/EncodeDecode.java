package src.com.bjoern.arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("neet", "code", "love", "you");
        System.out.println(strs);
        String encodedString = encode(strs);
        System.out.println(encodedString);
        List<String> decodedList = decode(encodedString);
        System.out.println(decodedList + "\n");

        List<String> strs2 = Arrays.asList("");
        System.out.println(strs2);
        String encodedString2 = encode(strs2);
        System.out.println(encodedString2);
        List<String> decodedList2 = decode(encodedString2);
        System.out.println(decodedList2 + "\n");

        List<String> strs3 = Arrays.asList();
        System.out.println(strs3);
        String encodedString3 = encode(strs3);
        System.out.println(encodedString3);
        List<String> decodedList3 = decode(encodedString3);
        System.out.println(decodedList3);

        System.out.println("Decoded size: " + decodedList2.size());
        System.out.println("Decoded elements:");
        for (int i = 0; i < decodedList2.size(); i++) {
            System.out.println("[" + i + "]: \"" + decodedList2.get(i) + "\"");
        }

    }

    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }

        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int index = 0;

        while (index < str.length()) {
            int wordIndex = index;

            while (str.charAt(wordIndex) != '#') {
                wordIndex++;
            }

            wordIndex++;
            int length = Integer.parseInt(str.substring(index,wordIndex-1));

            decodedString.add(str.substring(wordIndex, wordIndex + length));
            index = wordIndex + length;
        }

        return decodedString;
    }
}
