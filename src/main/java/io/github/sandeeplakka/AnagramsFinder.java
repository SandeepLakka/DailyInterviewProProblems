package io.github.sandeeplakka;

import java.util.*;

/**
 * This problem was recently asked by Twitter:
 * <p>
 * Given 2 strings s and t, find and return all indexes in string s where t is an anagram.
 * <p>
 * Here's an example and some starter code:
 * <pre>
 * def find_anagrams(s, t):
 * # Fill this in.
 * <p>
 * print(find_anagrams('acdbacdacb', 'abc'))
 * # [3, 7]
 * </pre>
 */
public class AnagramsFinder {

    public int[] find_anagrams(String s, String t) {
        if (s == null || t == null || t.length() > s.length()) return null;
        int wordlength = t.length();
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < s.length() - wordlength + 1; i++) {
            if (areAnagrams(t, s.substring(i, i + wordlength))) {
                resultList.add(i);
            }
        }
        return resultList.stream().mapToInt(Integer::valueOf).toArray();
    }

    private boolean areAnagrams(String t, String sub) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : sub.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        return map.values().stream().allMatch(val -> val == 0);
    }

}
