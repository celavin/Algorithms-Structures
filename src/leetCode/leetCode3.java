package leetCode;

import java.util.HashSet;
//哈希表加滑动窗口
public class leetCode3 {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int i = 0;

        int maxlength = 0;

        char[] charArray = s.toCharArray();
        for (int j = 0; j < charArray.length; j++) {
            char c = charArray[j];
            if (!hs.contains(c)) {
                hs.add(c);
            } else{
                while(i<j&&hs.contains(c)){
                    hs.remove(charArray[i]);
                    i+=1;
                }
                hs.add(c);
            }
            if(j-i+1 > maxlength) {
                maxlength = j - i + 1;

            }
        }
        return maxlength;
    }
}
