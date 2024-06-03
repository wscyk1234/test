package org.example;

import java.util.Arrays;

public class searchMatrix {
    public static int[] searchMatrix(int[][] matrix,int k){
        int len1 = matrix.length - 1;
        int len2 = matrix[0].length - 1;
        int row = 0;
        int col = len2;
        while (row <= len1 && col >= 0){
            if (matrix[row][col] == k){
                return new int[]{row,col};
            }else if (matrix[row][col] > k){
                col--;
            }else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }



    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int k = 432;
        int[] ans = searchMatrix(matrix,k);

        System.out.println(Arrays.toString(ans));

    }
}
