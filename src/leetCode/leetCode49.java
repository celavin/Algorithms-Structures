package leetCode;

import java.util.*;

public class leetCode49 {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = Arrays.toString(c);
            if (!hm.containsKey(s)) {
                hm.put(s, new ArrayList<String>());
            }
            hm.get(s).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> value : hm.values()) {
            result.add(value);
        }
        return result;
    }

    }
