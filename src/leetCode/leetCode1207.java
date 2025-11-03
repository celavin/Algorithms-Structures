package leetCode;

import java.util.HashMap;
import java.util.HashSet;

/*评论区解法
Map<Integer, Integer> counter = new HashMap<>();
        for (int elem : arr)
            counter.put(elem, counter.getOrDefault(elem, 0) + 1);

        return counter.size() == new HashSet<Integer>(counter.values()).size();*/
public class leetCode1207 {
    public static void main(String[] args) {

    }
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for (Integer value : hm.values()) {
            if(!hs.contains(value)){
                hs.add(value);
            }
            else {return false;}
        }

        return true;
    }
}
