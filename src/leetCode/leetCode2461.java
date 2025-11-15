package leetCode;

import java.util.HashMap;
import java.util.HashSet;

/*给你一个整数数组 nums 和一个整数 k 。请你从 nums 中满足下述条件的全部子数组中找出最大子数组和：

子数组的长度是 k，且
子数组中的所有元素 各不相同 。
返回满足题面要求的最大子数组和。如果不存在子数组满足这些条件，返回 0 。

子数组 是数组中一段连续非空的元素序列。*/
public class leetCode2461 {
    public static void main(String[] args) {

    }
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;
        int left = 0;
        int right = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(right<nums.length){
            sum += nums[right];
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
            right++;
            while(right-left >= k){
                if(hm.size()==k) max = Math.max(max,sum);
                sum -=nums[left];
                hm.put(nums[left],hm.get(nums[left])-1);
                if(hm.get(nums[left])==0) hm.remove(nums[left]);
                left++;
            }
        }
        return max;

    }

}
