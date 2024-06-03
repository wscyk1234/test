package org.example.substring;

import java.util.HashMap;

public class 和为k的子数组 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        int k = 3;
        int ans = subarraySum(nums,k);
        System.out.println(ans);
    }
    public static int subarraySum(int[] nums,int k){
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int presum = 0;
        for (int x : nums){
            presum += x;
            if (map.containsKey(presum-k)){
                count += map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
