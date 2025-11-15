package leetCode;

public class leetCode1343 {
    public static void main(String[] args) {

    }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr==null||k>arr.length) return 0;
        int ans = 0;
        int sum = 0;
        int left = 0;
        int right = -1;
        while(right<arr.length){
            right++;
            sum+=arr[right];
            if(right-left+1==k&&sum>=k*threshold){
                ans++;
            }
            while(right-left+1>=k){
                sum-=arr[left];
                left++;
            }
        }
        return ans;
    }
}
