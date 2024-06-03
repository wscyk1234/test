package org.example.matrix;

import java.util.ArrayList;
import java.util.List;

public class 螺旋矩阵 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {10,11,23,41}
        };
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result.toString());
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        int tr = 0;
        int tc = 0;
        int dr = matrix.length - 1;
        int dc = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        while (tr<=dr && tc <= dc){
            printEdge(matrix,tr++,tc++,dr--,dc--,ans);
        }
        return ans;
    }
    public static void printEdge(int[][] m,int tr,int tc,int dr,int dc,List<Integer> ans){
        if (tr==dr){
            for (int i = tc;i<=dc;i++){
                ans.add(m[tr][i]);
            }
        }else if (tc==dc){
            for (int i = tr;i<=dr;i++){
                ans.add(m[i][tc]);
            }
        }else {
            int curR = tr;
            int curC = tc;
            while(curC!=dc){
                ans.add(m[tr][curC]);
                curC++;
            }
            while(curR!=dr){
                ans.add(m[curR][dc]);
                curR++;
            }
            while(curC!=tc){
                ans.add(m[dr][curC]);
                curC--;
            }
            while(curR!=tr){
                ans.add(m[curR][tc]);
                curR--;
            }
        }

    }
}
