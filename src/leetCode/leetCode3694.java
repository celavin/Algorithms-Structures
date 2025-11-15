package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*3694. 删除子字符串后不同的终点

给你一个由字符 'U'、'D'、'L' 和 'R' 组成的字符串 s，表示在无限的二维笛卡尔网格上的移动。

'U': 从 (x, y) 移动到 (x, y + 1)。
'D': 从 (x, y) 移动到 (x, y - 1)。
'L': 从 (x, y) 移动到 (x - 1, y)。
'R': 从 (x, y) 移动到 (x + 1, y)。
你还得到了一个正整数 k。

你 必须 选择并移除 恰好一个 长度为 k 的连续子字符串 s。然后，从坐标 (0, 0) 开始，按顺序执行剩余的移动。

返回可到达的 不同 最终坐标的数量。*/
public class leetCode3694 {
    public static void main(String[] args) {

    }
    public int distinctPoints(String s, int k) {
        if(k==0) return 1;
        int[] destination = new int[2];
        HashMap<Character,int[]> hm = new HashMap<>();
        hm.put('U', new int[]{0, 1});
        hm.put('D',new int[]{0, -1});
        hm.put('L',new int[]{-1, 0});
        hm.put('R',new int[]{1,0});
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            destination[0] += hm.get(c)[0];
            destination[1] += hm.get(c)[1];
        }
        int left = 0;
        int right = 0;
        HashSet<String> ans = new HashSet<>();//
        char cur;

        while(right<charArray.length){
            cur = charArray[right];
            destination[0] -= hm.get(cur)[0];
            destination[1] -= hm.get(cur)[1];
            right++;

            while(right-left >=k){
                String now = destination[0]+","+destination[1];
                ans.add(now);
                cur = charArray[left];
                destination[0] += hm.get(cur)[0];
                destination[1] += hm.get(cur)[1];
                left++;
            }
        }
        return ans.size();
    }
}
