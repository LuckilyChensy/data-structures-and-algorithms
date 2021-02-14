package com.leetcode.no0001;

import java.util.HashMap;
import java.util.Map;

/**
 * 解决在检索 nums[i] 时,可以推算出目标数据时 target - nums[i], 那么在遍历一遍数组后应该可以确定目标数组中是否存在
 * 如何准确定位到已遍历信息
 *
 * HashMap 的key是目标值, value 是在数组中的索引
 */
public class Solution02 {

    public int[] twoSum(int[] nums, int target) {

        // HashMap 的key是目标值, value 是在数组中的索引
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0 ; i < nums.length; i++){

            int temp = target - nums[i];

            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }else{
                map.put(nums[i],i);
            }

        }

        return new int[]{-1,-1};
    }

}
