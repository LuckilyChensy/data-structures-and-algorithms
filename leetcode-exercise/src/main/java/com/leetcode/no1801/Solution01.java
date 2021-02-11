package com.leetcode.no1801;

public class Solution01 {
    public boolean isNumber(String s) {
        // 处理边界条件
        if( s == null || s.length() == 0){
            return false;
        }
        //标记是否遇到相应的情况
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;

        // 标记是否遇到了相应情况
        char[] chars = s.trim().toCharArray();

        for(int i=0; i < chars.length; i++){
            if(chars[i] >= '0' && chars[i] <='9'){
                numSeen = true;
            }else if(chars[i] == '.'){
                // 之前不能出现 . 或者 e
                if(dotSeen||eSeen){
                    return false;
                }
                dotSeen = true;
            }else if(chars[i] == 'e' || chars[i] =='E'){
                // e 之前不能出现e，必须出现数
                if(eSeen||!numSeen){
                    return false;
                }
                eSeen = true;
                numSeen = false;
            }else if(chars[i] == '-'||chars[i] == '+'){
                // +- 出现在0位置，或者e/E 后面第一个位置才是合法的
                if(i!=0 && chars[i-1]!='e' && chars[i-1]!='E'){
                    return false;
                }
            }else{
                return false;
            }
        }
        return numSeen;
    }
}
