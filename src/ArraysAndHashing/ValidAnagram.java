package ArraysAndHashing;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(ValidAnagramSolution("accs","scac"));
    }
//    Find question at bottom or
//    Link: https://leetcode.com/problems/valid-anagram/description/
    public static boolean ValidAnagramSolution(String s,String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int freq[] = new int[26];
        for (char a : s.toCharArray()) {
            freq[a - 'a']++;
        }
        for (char a : t.toCharArray()) {
            freq[a - 'a']--;
        }
        for (int f : freq) {
            if (f != 0) {
                return false;
            }
        }
        return true;
    }
}
//Question
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false
//