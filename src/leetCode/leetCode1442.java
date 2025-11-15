package leetCode;

public class leetCode1442 {
    public static void main(String[] args) {
        
        
    }
    public int maxScore(String s) {
        int max = 0;
        int score = 0;
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            for (int j = 0; j <charArray.length ; j++) {
                if((j<i&&charArray[j]=='0')||(j>=i&charArray[j]=='1')){
                    score++;
                }
            }
            if(score>max) max = score;
            score = 0;
        }
        return max;
    }
}
