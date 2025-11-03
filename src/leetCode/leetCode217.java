package leetCode;

import java.util.HashSet;
//hashmap
/*给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。

*/
public class leetCode217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if(! hs.contains(num)){
                hs.add(num);
            }else {return true;}
        }

        return false;
    }
}
