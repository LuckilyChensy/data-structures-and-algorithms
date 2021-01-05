package com.leetcode.no0567;

public class Solution01 {

    boolean flag = false;

    public boolean checkInclusion(String s1,String s2){
        permute(s1,s2,0);
        return flag;
    }

    public void permute(String s1,String s2,int length){
        if(length == s1.length()){
            if(s2.indexOf(s1)>=0){
                flag = true;
            }else{
                for(int i = 1; i < s1.length(); i++){
                    s1 = swap(s1,length,i);
                    permute(s1,s2,length + 1);
                    s1 = swap(s1,length,i);
                }
            }
        }
    }

    public String swap(String s, int i0, int i1) {
        if (i0 == i1) {
            return s;
        }
        String s1 = s.substring(0, i0);
        String s2 = s.substring(i0 + 1, i1);
        String s3 = s.substring(i1 + 1);
        return s1 + s.charAt(i1) + s2 + s.charAt(i0) + s3;
    }

}
