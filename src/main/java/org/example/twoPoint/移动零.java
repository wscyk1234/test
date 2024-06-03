package org.example.twoPoint;

import java.util.Arrays;

public class 移动零 {
    static int[] nums = new int[] {0,1,0,3,12};
    public static void main(String[] args) {
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeros(int[] nums){
        int i = 0;
        for (int j = 0;j<nums.length;j++){
            if (nums[j]!=0){
                nums[i++] = nums[j];
            }
        }
        while (i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}
