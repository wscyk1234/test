package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class matrixRotate {
    public static void matrixRotate(int[][] matrix){
        int tr = 0;
        int tc = 0;
        int dr = matrix.length - 1;
        int dc = matrix[0].length - 1;

        while(tr < dr){
            rotateEdge(matrix,tr++,tc++,dr--,dc--);
        }

    }
    public static void rotateEdge(int[][] m,int tr,int tc,int dr,int dc){
        int times = dc - tc;
        int tmp = 0;
        for (int i = 0;i!=times;i++){
            tmp = m[tr][tc+i];
            m[tr][tc+i] = m[dr-i][tc];
            m[dr-i][tc] = m[dr][dc-i];
            m[dr][dc-i] = m[tr+i][dc];
            m[tr+i][dc] = tmp;

        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {10,11,23,41}
        };
        matrixRotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
