package leetCode;

import java.util.HashMap;

public class leetCode383 {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for (char c : ransomNote.toCharArray()) {
            if(!hm.containsKey(c)){
                return false;
            }
            hm.put(c,hm.get(c)-1);
            if(hm.get(c) == -1){
                return false;
            }
        }
        return true;
    }
}
