package com.leetcode.no0169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution02 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
