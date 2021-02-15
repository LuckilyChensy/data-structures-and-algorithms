package com.leetcode.no0022;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public List<String> generateParenthesis(int n){

        List<String> result = new ArrayList<>();

        // 特判
        if(n == 0){ return result;}

        dfs("",n,n,result);

        return result;
    }

    /**
     * left ( 剩余数量
     * right ) 剩余数量
     */
    private void dfs(String curStr,int left,int right,List<String> result){

        if(left == 0 || right == 0){
            result.add(curStr);
            return ;
        }

        //
        if(left > right){
            return;
        }

        if(left > 0){
            dfs(curStr+"(",left - 1,right,result);
        }

        if(right > 0){
            dfs(curStr+")",left,right - 1,result);
        }

    }
}
