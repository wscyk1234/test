package org.example.slidingWindow;

import java.util.ArrayList;
import java.util.List;


public class 找到字符串中所有字母异位词 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = new ArrayList<>();
        ans = findAnagrams(s,p);
        System.out.println(ans);
    }
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> ans = new ArrayList<>();
        int len1 = s.length();
        int len2 = p.length();
        if (len1 < len2){
            return ans;
        }
        int[] lo = new int[26];
        int[] sh = new int[26];
        for (int i = 0;i<len2;i++){
            sh[p.charAt(i)-'a']++;
        }
        int start = 0;
        for (int end = 0;end < len1;end++){
            int now = s.charAt(end) - 'a';
            lo[now]++;
            while(lo[now] > sh[now]){
                int pre = s.charAt(start) - 'a';
                lo[pre]--;
                start++;
            }
            if (end-start+1 == len2){
                ans.add(start);
            }
        }
        return ans;
    }
}
