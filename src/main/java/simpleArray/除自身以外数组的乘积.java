package simpleArray;

import java.util.Arrays;

public class 除自身以外数组的乘积 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};

        int[] res = productExceptSelf(nums);

        System.out.println(Arrays.toString(res));

    }
    public static int[] productExceptSelf(int[] nums){
        int len = nums.length;
        if (len == 0){
            return new int[0];
        }
        int[] ans = new int[len];
        ans[0] = 1;
        int tep = 1;
        for (int i =1;i<len;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        for (int i =len-2;i>=0;i--){
            tep = nums[i+1] * tep;
            ans[i] = ans[i] * tep;
        }

        return ans;
    }
}
