package com.leetcode.no0767;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution01 {

    public String reorganizeString(String s){

        if( s == null || s.length() == 0){
            return "";
        }

        // 统计字母出现的次数
        int[] freqs = new int[26];
        for(int i = 0;i < s.length(); i++){
            ++freqs[s.charAt(i)-'a'];
        }

        Queue<int[]> queue = new PriorityQueue<>(
            (a,b) ->a[1]!=b[1]?b[1] - a[1]:a[0]-b[0]
        );

        for(int i = 0; i< freqs.length;++i){
            if(freqs[i] != 0){
                queue.add(new int[]{'a'+i,freqs[i]});
            }
        }

        StringBuilder sb = new StringBuilder();

        while(queue.size() > 1){
            int[] first = queue.poll();
            int[] second = queue.poll();

            sb.append((char)first[0]).append((char)second[0]);
            if(--first[1]>0){ queue.add(first); }
            if(--second[1]>0){ queue.add(second); }
        }

        if(queue.isEmpty()){ return sb.toString(); }
        int[] peek = queue.poll();
        if(peek[1] != 1) { return ""; }
        return sb.append((char)peek[0]).toString();
    }

}
