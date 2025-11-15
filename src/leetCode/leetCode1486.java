package leetCode;

public class leetCode1486 {
    public static void main(String[] args) {

    }
    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n ; i++) {
            ans = ans^(start + 2*i);
        }
        return ans;
    }
}
