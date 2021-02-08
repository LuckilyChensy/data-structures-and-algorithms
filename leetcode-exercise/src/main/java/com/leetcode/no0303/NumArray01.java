package com.leetcode.no0303;

public class NumArray01 {

    private int[] data;

    public NumArray01(int[] nums) {
        data = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k = i;k <= j; k++){
            sum += data[k];
        }
        return sum;
    }

}
