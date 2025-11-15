package leetCode;

public class leetCode1281 {
    public static void main(String[] args) {

    }
    public int subtractProductAndSum(int n) {
        int a = 1;
        int b = 0;
        while(n!=0){
            a = a*(n%10);
            b = b+n%10;
            n = n/10;
        }
        return a-b;

    }
}
