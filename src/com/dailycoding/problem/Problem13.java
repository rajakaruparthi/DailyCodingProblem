package com.daily.coding;

/*
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".
 */

import java.util.HashMap;
import java.util.Map;

public class Problem13 {

    public static void main(String[] args) {
        String input = "abcba";
        int k = 2;
        Problem13 p = new Problem13();
        p.longestSubstring(input, k);
    }

    private void longestSubstring(String input, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length() - k; i++) {
            int startIndex = i;
            String eachSubstring = getSubstringWithKuniqueChars(startIndex, input, k);
            map.put(eachSubstring, eachSubstring.length());
        }
        map.put(input.substring(input.length() - k), k);
        System.out.println(getMaxSubString(map));
    }

    private String getMaxSubString(HashMap<String, Integer> map) {
        int max = 0;
        String output = "";
        for (String key : map.keySet()) {
            int val = map.get(key);
            if (val > max) {
                max = val;
                output = key;
            }
        }
        return output;
    }

    private String getSubstringWithKuniqueChars(int startIndex, String input, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = startIndex;
        String out = "";
        while (map.keySet().size() <= k) {
            char character = input.charAt(startIndex);
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
            if (startIndex < input.length()) {
                out = input.substring(i, startIndex);
                startIndex++;
            }
        }
        return out;
    }
}
