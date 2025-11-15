package leetCode;

public class leetCode231 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
        int a = 1;
        while(a<=n){
            if(a==n)return true;
            a = a*2;
        }
        return false;

    }
}
