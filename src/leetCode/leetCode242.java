package leetCode;

import java.util.HashMap;

public class leetCode242 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (!h1.containsKey(c)) {
                h1.put(c, 1);
            } else {
                h1.put(c, h1.get(c) + 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (!h2.containsKey(c)) {
                h2.put(c, 1);
            } else {
                h2.put(c, h2.get(c) + 1);
            }
        }
        if (h1.equals(h2)) {
            return true;
        } else {
            return false;
        }
    }
}
