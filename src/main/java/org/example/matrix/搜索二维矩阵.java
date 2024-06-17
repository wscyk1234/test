package org.example.matrix;

import java.util.Arrays;

public class 搜索二维矩阵 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int k = 100;
        int[] ans = searchMatrix(matrix,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchMatrix(int[][] m,int k){
        int lenR = m.length - 1;
        int lenC = m[0].length - 1;
        int row = 0;
        int col = lenC;
        while (row <= lenR && col>=0){
            if (k == m[row][col]){
                return new int[]{row,col};
            }else if (k < m[row][col]){
                col--;
            }else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
