package com.leetcode.no0350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution01 {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> counter = new HashMap<Integer,Integer>();

        for(int num:nums1){
            int cnt = counter.getOrDefault(num,0);
            counter.put(num,cnt+1);
        }

        List<Integer> list = new ArrayList<Integer>();

        for(int num:nums2){
            int cnt = counter.getOrDefault(num,0);
            if(cnt>0){
                list.add(num);
                counter.put(num,cnt-1);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size();i++){
            result[i] = list.get(i);
        }

        return result;

    }

}
