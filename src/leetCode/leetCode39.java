package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。

candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。

对于给定的输入，保证和为 target 的不同组合数少于 150 个。

 */
public class leetCode39 {
    public static void main(String[] args) {
        leetCode39 a = new leetCode39();
        System.out.println(a.combinationSum(new int[]{2, 3, 5}, 8));

    }
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    int[] candidates;
    int target;
     List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        backtrace(0);
        return result;

    }
    void backtrace(int sum){
        if(sum==target){
            Collections.sort(current);
            if(!result.contains(current)){
                System.out.println("添加"+current+",此时sum:"+sum);
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(sum>target){
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrace(sum+candidates[i]);
            current.remove(current.size()-1);
        }
    }

}
