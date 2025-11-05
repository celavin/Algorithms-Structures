package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，
返回这些子串的起始索引。不考虑答案输出的顺序。

 */
//定长滑窗
//easy
public class leetCode438 {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> needs = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for (char c : p.toCharArray()) {
            needs.put(c,needs.getOrDefault(c,0)+1);
        }
        int valid = 0,left = 0,right = 0;
        while(right<=s.length()-1){
            char charIn = s.charAt(right);
            right++;
            if(needs.containsKey(charIn)){
                window.put(charIn,window.getOrDefault(charIn,0)+1);
                if(needs.get(charIn).equals(window.get(charIn))){
                    valid++;
                }
            }
            if(right-left >= p.length()){
                if(valid == needs.size()){
                    result.add(left);
                }
                char charOut = s.charAt(left);
                left++;
                if(needs.containsKey(charOut)){
                    if(needs.get(charOut).equals(window.get(charOut))){
                        valid--;
                    }
                    window.put(charOut,window.get(charOut)-1);
                }
            }
        }


        return result;
    }
}
