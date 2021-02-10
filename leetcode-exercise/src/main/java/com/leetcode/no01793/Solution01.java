package com.leetcode.no01793;

import java.util.LinkedList;
import java.util.Queue;

public class Solution01 {

    public int movingCount(int m, int n, int k){

        boolean[][] visited = new boolean[m][n];

        int res = 0;

        Queue<int[]> queue = new LinkedList<int[]>();

        queue.add(new int[]{0,0,0,0});

        while(queue.size() > 0){

            int[] x = queue.poll();

            int i = x[0];
            int j = x[1];
            int si = x[2];
            int sj = x[3];

            if(i >= m || j >= n || k < si+sj ||visited[i][j]){
                continue;
            }

            visited[i][j] = true;

            res++;

            queue.add(new int[]{i+1,j,(i+1)%10!=0?si+1:si-8,sj});
            queue.add(new int[]{i,j+1,si,(j+1)%10!=0?sj+1:sj-8});
        }

        return res;
    }
}
