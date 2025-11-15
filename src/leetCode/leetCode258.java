package leetCode;

public class leetCode258 {
    public static void main(String[] args) {

    }
    public int addDigits(int num) {
        int tmp = 0;
        while(num>=10){
            while(num!=0){
                tmp += num%10;
                num/=10;
            }
            num = tmp;
            tmp = 0;
        }

        return num;
    }
}
