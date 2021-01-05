package com.leetcode.no0567;

import java.util.HashSet;
import java.util.Set;

public class Solution02 {

    public boolean checkInclusion(String s1,String s2){

        if(s1.length() > s2.length()){
            return false;
        }

        // 'z' = 122 ,不过一般都是2的倍数。 这样就省去了 +(-)'a'的功夫，简洁很多，也不容易出错
        int[] needs = new int[128];
        int[] inWindow = new int[128];

        // 记录 s1 有多少种字母
        Set<Character> set = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            needs[ch]++;
            set.add(ch);
        }

        int needCharNums = set.size();

        //关键，维护一个大小为 s1.length() 的滑动窗口，窗口内的字母数量对应即合法
        int windowLen = s1.length();
        // 通过变量valid，指示窗口内已满足条件的字母数量，省去每次扫描 26个字母数量是否相等
        int valid = 0;

        int left = 0;
        // 把初始化窗口整合到了while中，因此right = 0;
        int right = 0;

        while (right < s2.length()) {

            char cur = s2.charAt(right);
            right++;
            inWindow[cur]++;
            // 细节1: 两个if条件必须对应，用 == 较好理解。
            // 细节2.1: 此处是先归入窗口inWin[]++ ,再判断if。
            if (inWindow[cur] == needs[cur]) {
                valid++;
            }
            if (valid == needCharNums) {
                return true;
            }

            // 窗口还未初始化完成 , [0,windowLen) ----  [left,right) ( 因为right++了)
            if(right < windowLen){
                continue;
            }

            char leftChar = s2.charAt(left);
            left++;
            //细节2.2 :缩小窗口时，是先判断if,再缩小inWin[]--
            if (inWindow[leftChar] == needs[leftChar]) {
                valid--;
            }
            inWindow[leftChar]--;
        }
        return false;
    }
}
