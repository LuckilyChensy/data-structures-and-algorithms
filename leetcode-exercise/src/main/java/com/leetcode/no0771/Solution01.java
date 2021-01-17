package com.leetcode.no0771;

public class Solution01 {

    public int numJewelsInStones(String jewels, String stones) {

        if(jewels == null || stones == null||jewels.length() == 0||stones.length()==0 ){
            return 0;
        }

        int cnt = 0;

        for(int i = 0; i < jewels.length(); ++i){
            for(int j = 0; j < stones.length(); ++j){
                if(jewels.charAt(i) == stones.charAt(j)){
                    ++cnt;
                }
            }
        }

        return cnt;

    }

}
