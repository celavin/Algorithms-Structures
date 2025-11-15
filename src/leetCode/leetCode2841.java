package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*2841. 几乎唯一子数组的最大和

给你一个整数数组 nums 和两个正整数 m 和 k 。

请你返回 nums 中长度为 k 的 几乎唯一 子数组的 最大和 ，如果不存在几乎唯一子数组，请你返回 0 。

如果 nums 的一个子数组有至少 m 个互不相同的元素，我们称它是 几乎唯一 子数组。

子数组指的是一个数组中一段连续 非空 的元素序列。

 */
public class leetCode2841 {
    public static void main(String[] args) {
    }
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;
        long sum = 0;
        long max = 0;
        int val;
        int count = 0;
        while(right<=nums.size()-1){
            val = nums.get(right);
            hm.put(val,hm.getOrDefault(val,0)+1 );
            if(hm.get(val)==1) count++;
            sum += val;
            right++;
            while(right-left >=k){
                if(sum>max&& count>=m) max = sum;
                val = nums.get(left);
                hm.put(val,hm.get(val)-1);
                if(hm.get(val)==0) count--;
                sum -=val;
                left++;
            }

        }
        return max;
    }
}
