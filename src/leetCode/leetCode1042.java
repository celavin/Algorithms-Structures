package leetCode;
/*有一个书店老板，他的书店开了 n 分钟。每分钟都有一些顾客进入这家商店。给定一个长度为 n 的整数数组 customers ，其中 customers[i] 是在第 i 分钟开始时进入商店的顾客数量，所有这些顾客在第 i 分钟结束后离开。

在某些分钟内，书店老板会生气。 如果书店老板在第 i 分钟生气，那么 grumpy[i] = 1，否则 grumpy[i] = 0。

当书店老板生气时，那一分钟的顾客就会不满意，若老板不生气则顾客是满意的。

书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续 minutes 分钟不生气，但却只能使用一次。

请你返回 这一天营业下来，最多有多少客户能够感到满意 。*/

//滑动窗口
public class leetCode1042 {
    public static void main(String[] args) {

    }
    public int
    maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        if(customers==null||customers.length==0) return 0;
        int current = 0;
        for (int i = 0; i < customers.length; i++) {
            if(grumpy[i]==0) current+=customers[i];
         }
        int max = current;
        int left = 0;
         int right = -1;
         while(right<customers.length-1){
             right++;
             if(grumpy[right]==1) current+=customers[right];
             if(current>max) max = current;
             while(right-left+1>=minutes){
                 if(grumpy[left]==1){
                     current -= customers[left];
                 }
                 left++;
             }
         }
        return max;
    }
}
