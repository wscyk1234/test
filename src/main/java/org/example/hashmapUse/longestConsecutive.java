package org.example.hashmapUse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class longestConsecutive {
    public static void main(String[] args) {
        int[] nums = new int[] {100,4,200,1,3,2,5,6,7,8,9};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
    public static int longestConsecutive(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums){
            map.put(num,num);
        }
        for (int num : nums){
            if (!map.containsKey(num-1)){
                int right = map.get(num);
                while (map.containsKey(right+1)){
                    right = right+1;
                }
                ans = Math.max(ans,right-num+1);
            }
        }
        return ans;
    }
}
