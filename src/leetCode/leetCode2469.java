package leetCode;

public class leetCode2469 {
    public static void main(String[] args) {

    }
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius+273.15;
        ans[1] = celsius*1.8+32;
        return ans;

    }
}
