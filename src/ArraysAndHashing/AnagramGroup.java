package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramGroup {

    //    Question:
//    https://leetcode.com/problems/group-anagrams/description/
    public static void main(String[] args) {
        List<String> stringList = List.of("eat", "tea", "tan", "ate", "nat", "bat");
        AnagramGroupSolution(stringList).forEach(System.out::println);
    }

    public static List<List<String>> AnagramGroupSolution(List<String> list) {

        if (list == null || list.size() == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : list) {
            char freq[] = new char[26];
            for (char a : str.toCharArray()) freq[a - 'a']++;
            String val = String.valueOf(freq);
            if (!map.containsKey(val)) map.put(val, new ArrayList<>());
            map.get(val).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
