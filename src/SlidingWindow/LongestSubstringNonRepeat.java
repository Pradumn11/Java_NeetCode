package SlidingWindow;

import java.util.HashMap;


//Question
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringNonRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringSolution("bbb"));
    }
    public static int lengthOfLongestSubstringSolution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int strt = 0;
        int j = 0;
        int length = 0;
        int n = s.length();

        while (j < n) {
            char a = s.charAt(j);
            if (map.containsKey(a)) {
                strt = Math.max(map.get(a) + 1, strt);
            }
            map.put(a, j);
            length = Math.max(j - strt + 1, length);
            j++;
        }
        return length;
    }
}

