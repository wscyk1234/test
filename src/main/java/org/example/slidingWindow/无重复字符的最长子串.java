package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s){
        int ans = 0;
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for (int end = 0,start=0;end < n;end++){
            char now = s.charAt(end);
            if (map.containsKey(now)){
                start = Math.max(start,map.get(now));
            }
            ans = Math.max(ans,end - start + 1);
            map.put(s.charAt(end),end+1);
        }
        return ans;
    }
}
