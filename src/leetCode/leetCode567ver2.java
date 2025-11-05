package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*给你两个字符串 s1 和 s2 ，
写一个函数来判断 s2 是否包含 s1 的 排列。如果是，返回 true ；否则，返回 false 。

换句话说，s1 的排列之一是 s2 的 子串 。*/
//滑动窗口版本
//失败原因:超时,用可变窗口的思路解固定窗口题目太麻烦了
public class leetCode567ver2 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
    static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        HashMap<Character,Integer> needs = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        int count = 0;
        for (char c : s1.toCharArray()) {
            needs.put(c,needs.getOrDefault(c,0)+1);
        }
        int i = 0;
        int j = -1;
        char[] charArray = s2.toCharArray();
        char c;
        while(j<=charArray.length-1){
            while(j<charArray.length-1&&count<needs.size()){//j扩张
                j++;
                c = charArray[j];
                if(needs.containsKey(c)){
                    window.put(c,window.getOrDefault(c,0)+1);
                    if(needs.get(c).equals(window.get(c))){
                        count++;
                    }
                }

            }
            while(count==needs.size()&&j-i+1!=s1.length()){//i缩减,第一个条件不满足则不能在缩减了
                c = charArray[i];
                if(needs.containsKey(c)){
                    window.put(c,window.get(c)-1);
                    if(needs.get(c) != window.get(c)){
                        count--;
                    }
                }
                i++;
            }
            if(count==needs.size() && j-i+1==s1.length()){
                return true;
            }
        }
        return false;
    }
}
