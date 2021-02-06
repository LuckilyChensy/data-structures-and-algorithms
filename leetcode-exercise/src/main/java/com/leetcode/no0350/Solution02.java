package com.leetcode.no0350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int m = nums1.length;
        int n = nums2.length;

        List<Integer> list = new ArrayList<Integer>();

        while(i < m && j < n){

            if(nums1[i] == nums2[j] ){
                list.add(nums1[i]);
                ++i;
                ++j;
            }else if(nums1[i] < nums2[j]){
                ++i;
            }else{
                ++j;
            }
        }

        int[] result = new int[list.size()];

        for(int k = 0; k < list.size(); ++k){
            result[k] = list.get(k);
        }

        return result;

    }

}
