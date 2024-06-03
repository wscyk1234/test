package org.example.hashmapUse;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 26;
        int[] ans = new int[2];
        ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
