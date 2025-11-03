package leetCode;

import java.util.HashMap;

public class leetCode1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=hm.get(target-nums[i]);
                return result;
            }
            hm.put(nums[i],i);
        }


        return null;
    }
}
