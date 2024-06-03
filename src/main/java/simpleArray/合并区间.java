package simpleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 合并区间 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3},
                {2,6},
                {8,10},
                {15,18}
        };
        int[][] result = merge(matrix);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] merge(int[][] nums){
        int len = nums.length;
        if (len == 0){
            return new int[0][0];
        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        int l = nums[0][0];
        int r = nums[0][1];
        for (int i = 1;i < len;i++){
            if (nums[i][0]>r){
                res.add(new int[]{l,r});
                l = nums[i][0];
                r = nums[i][1];
            }else {
                r = Math.max(r,nums[i][1]);
            }
        }
        res.add(new int[]{l,r});
        return res.toArray(new int[res.size()][]);
    }
}
