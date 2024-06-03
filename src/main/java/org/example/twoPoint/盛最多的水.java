package org.example.twoPoint;

import java.util.Arrays;

public class 盛最多的水 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(nums);
        System.out.println(ans);
    }
    public static int maxArea(int[] nums){
        int ans = 0;
        int i = 0;
        int j = nums.length-1;
        while (i < j){
            ans = Math.max(ans,(j-i)*Math.min(nums[i],nums[j]));
            if (nums[i]<nums[j]){
                i++;
            }else {
                j--;
            }
        }
        return ans;
    }
}
