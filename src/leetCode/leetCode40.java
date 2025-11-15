package leetCode;

import javax.swing.text.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的每个数字在每个组合中只能使用 一次 。

注意：解集不能包含重复的组合。 */


public class leetCode40 {
    public static void main(String[] args) {

    }
    List<List<Integer>> result = new ArrayList<>();
    int[] candidates;
    int target;
    List<Integer> current = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;
        backtrace(0,0);
        return null;
    }
    void backtrace(int sum,int start){
        if(sum==target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(sum>target) return;
        for (int i = start; i < candidates.length; i++) {
            if(candidates[i]>target) break;
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            current.add(candidates[i]);
            backtrace(sum+candidates[i],i+1);
            current.remove(current.size()-1);
        }
    }

}
