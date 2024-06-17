package org.example.simpleArray;

public class 最大子数组和 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
    public static int maxSubArray(int[] nums){
        int n = nums.length;
        int[] df = new int[n+1];
        df[0] = nums[0];
        int ans = df[0];
        for (int i = 1;i < n;i++){
            if (df[i-1]>=0){
                df[i] = df[i-1] + nums[i];
            }else {
                df[i] = nums[i];
            }
            ans = Math.max(ans,df[i]);
        }
        return ans;
    }
}
