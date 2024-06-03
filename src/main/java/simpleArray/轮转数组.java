package simpleArray;

import java.util.Arrays;

public class 轮转数组 {
    public static void rotate1(int[] nums,int k){
        int len = nums.length;
        int[] now = new int[len+1];
        for (int i=0;i<len;i++){
            int rem = (i+k)%len;
            now[rem] = nums[i];
        }
        for (int i=0;i<len;i++){
            nums[i] = now[i];
        }
    }

    public static void rotate2(int[] nums,int k){
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);


    }
    public static void reverse(int[] nums,int start,int end){
        while (start<end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }

    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4,5};
        int k = 3;
        int[] nums2 = new int[]{1,2,3,4,5};

        rotate1(nums1,k);
        rotate2(nums2,k);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}
