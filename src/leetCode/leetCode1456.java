package leetCode;

import java.util.HashSet;

public class leetCode1456 {
    public static void main(String[] args) {

    }
    public int maxVowels(String s, int k) {
        if(s==null||s.length()==0) return 0;
        int left = 0;
        int right = -1;
        int max = 0;
        int current = 0;
        char s1,s2;
        HashSet<Character> hs = new HashSet<>()
         {{add('a');add('e');add('i');add('o');add('u');}};

        while(right <s.length()-1){
            right++;
            s2 = s.charAt(right);
            if(hs.contains(s2)){
                current++;
                if(current>max) max = current;

            }
            while(right-left+1>=k){
                s1 = s.charAt(left);
                if(hs.contains(s1)){
                    current--;
                }
                left++;
            }
        }



        return max;
    }

}
