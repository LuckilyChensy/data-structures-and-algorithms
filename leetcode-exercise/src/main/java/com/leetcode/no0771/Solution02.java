package com.leetcode.no0771;

public class Solution02 {

    public int numJewelsInStones(String jewels, String stones) {

        if(jewels == null || stones == null || jewels.length() == 0 || stones.length() == 0){
            return 0;
        }

        boolean[] d = new boolean[256];
        int cnt = 0;

        for(int i = 0; i < jewels.length(); ++i ){
            d[jewels.charAt(i)] = true;
        }

        for(int i = 0; i < stones.length(); ++i){
            if(d[stones.charAt(i)]){
                ++cnt;
            }
        }

        return cnt;

    }

}
