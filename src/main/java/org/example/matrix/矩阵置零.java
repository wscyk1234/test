package org.example.matrix;

import java.util.Arrays;
import java.util.List;

public class 矩阵置零 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {10,11,0,41}
        };
        // 设置零
        setZeroes(matrix);

        // 打印结果
        System.out.println("结果矩阵：");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean row_flag = false;
        boolean col_flag = false;
        for (int i = 0;i < row; i++){
            if (matrix[i][0] == 0){
                col_flag = true;
                break;
            }
        }
        for (int i = 0;i < col; i++){
            if (matrix[0][i] == 0){
                row_flag = true;
                break;
            }
        }
        for (int i = 1;i<row;i++){
            for (int j = 1;j<col;j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1;i<row;i++){
            for (int j = 1;j<col;j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if (col_flag == true){
            for (int i = 0;i < row; i++){
                matrix[i][0] = 0;
            }
        }
        if (row_flag == true){
            for (int i = 0;i < col; i++){
                matrix[0][i] = 0;
            }
        }
    }

}
