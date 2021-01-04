package com.leetcode.no0051;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
1. 由于NXN个格子放N个皇后，同一行不能放置2个皇后，所以皇后必然放置在不同行，
从而可以用一维数组来存储每行皇后所在列位置，成功降维到一维数组全排列问题；
2. 由于皇后已在不同行，于是只需要判断皇后是否位于对角线上，判断的规律为，2个皇后的行位置间隔等于列位置间隔即为在同一对角线上，
        i - j == pos[i] - pos[k] || j - i == pos[i] - pos[j];
   对所有排列逐一验证，打印符合判定的排列；
*/

public class Solution01 {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

       int[] pos = new int[n];

       for(int i = 0; i < n; ++i){
           pos[i] = i;
       }

       permutation(pos,n,0);

       return res;

    }

    void permutation(int pos[], int n, int i){
        if(i == n){
            if(check(pos,n)){
                printQueen(pos,n);
            }
        }else{
            for(int k = i; k < n; ++k){
                int temp = pos[k];
                pos[k] = pos[i];
                pos[i] = temp;

                permutation(pos,n,i + 1);
                temp = pos[i];
                pos[i] = pos[k];
                pos[k] = temp;
            }
        }
    }

    boolean check(int pos[],int n){
        for(int i = 0; i<n; ++i){
            for(int j = i+1; j<n; ++j){
                if((i - j == pos[i] - pos[j]) || (j - i == pos[i] - pos[j])){
                    return false;
                }
            }
        }
        return true;
    }

    void printQueen(int pos[], int n) {
        List<String> arr = new ArrayList<>();
        res.add(arr);
        for (int i = 0; i < n; ++i){
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < n; j ++) {
                sb.append(j == pos[i] ? "Q" : ".");
            }
            arr.add(sb.toString());
        }
    }

}
