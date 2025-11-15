package leetCode;

import java.util.HashSet;

public class leetCode2586 {
    public static void main(String[] args) {

    }
    public int vowelStrings(String[] words, int left, int right) {

        HashSet<Character> hs = new HashSet<>();
            hs.add('a');
            hs.add('e');
            hs.add('i');
            hs.add('o');
            hs.add('u');
        int ans = 0;
        for (int i = left; i <=right ; i++) {
            String word = words[i];
            if(hs.contains(word.charAt(0))&&hs.contains(word.charAt(word.length()-1))){
                ans++;
            }
        }
        return ans;
    }
}
