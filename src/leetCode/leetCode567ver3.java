package leetCode;

import java.util.HashMap;

/*给你两个字符串 s1 和 s2 ，
写一个函数来判断 s2 是否包含 s1 的 排列。如果是，返回 true ；否则，返回 false 。

换句话说，s1 的排列之一是 s2 的 子串 。*/

//
public class leetCode567ver3 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
    static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> needs = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        int valid = 0;
        for (char c : s1.toCharArray()) {
            needs.put(c,needs.getOrDefault(c,0)+1);
        }
        int left = 0,right = 0;


        //right指针无脑向右扩张,只有达到长度限制left才会被动缩减
        while(right<s2.length()){
            char charIn = s2.charAt(right);
            right++;
            if(needs.containsKey(charIn)){
                window.put(charIn,window.getOrDefault(charIn,0)+1);
                if(window.get(charIn).equals(needs.get(charIn))){
                    valid++;
                }
            }
            if(right-left >=s1.length()){
                if(valid==needs.size()) return true;
                char charOut = s2.charAt(left);
                left++;
                if(needs.containsKey(charOut)){
                    if (window.get(charOut).equals(needs.get(charOut))) {
                        valid--;
                        //这里先检查很重要!.因为我们只在跨越'相等状态'时才会改变valid
                    }
                    window.put(charOut, window.get(charOut) - 1);
                }
            }
        }
        return false;
    }
}
