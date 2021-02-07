package com.leetcode.no0119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution01 {

    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();

        for( int i = 0; i <= rowIndex; i++){

            List<Integer> row = Arrays.asList(new Integer[i+1]);
            row.set(0,1);
            row.set(i,1);

            for(int j = 1; j < i; ++j){
                row.set(j,triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }

            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }

}
