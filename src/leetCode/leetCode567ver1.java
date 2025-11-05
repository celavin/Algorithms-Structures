package leetCode;

import java.util.Arrays;

/*给你两个字符串 s1 和 s2 ，
写一个函数来判断 s2 是否包含 s1 的 排列。如果是，返回 true ；否则，返回 false 。

换句话说，s1 的排列之一是 s2 的 子串 。*/

//没用到滑动窗口,等会再写一个滑动窗口版本的
public class leetCode567ver1 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
    static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        char[] charArrays1 = s1.toCharArray();
        Arrays.sort(charArrays1);
        String target = new String(charArrays1);
        char[] charArrays2 = s2.toCharArray();
        int j;
        for (int i = 0; i <= charArrays2.length-charArrays1.length; i++) {
            j=i+charArrays1.length;
            char[] slice = Arrays.copyOfRange(charArrays2,i,j);
            Arrays.sort(slice);
            String str = new String(slice);
            if(str.equals(target)){
                return true;
            }
        }
        return false;
    }
}
