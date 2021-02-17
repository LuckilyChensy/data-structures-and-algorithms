package com.leetcode.no1848;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public int[][] findContinuousSequence(int target){

        int left = 1;
        int right = 1;
        int sum = 0;

        List<int[]> result = new ArrayList<>();

        while(left <= target/2){
            if(sum < target){
                sum += right;
                right++;
            }else if( sum > target){
                sum -= left;
                left++;
            }else{
                int[] temp = new int[right-left];
                for(int i = left; i < right; i++){
                    temp[i-left] = i;
                }
                result.add(temp);
                sum -= left;
                left++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

}
