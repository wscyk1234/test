package org.example.hashmapUse;

import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = new ArrayList<>();
        ans = groupAnagrams(strs);
        System.out.println(ans);
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0;i< strs.length;i++){
            String change = change(strs[i]);
            if (map.containsKey(change)){
                map.get(change).add(strs[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(change,list);
            }
        }
        for (Map.Entry<String,List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static String change(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
