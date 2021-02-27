package com.leetcode.no1814;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution01 {

    public double myPow(double x, int n) {

         if( x == 1.0){ return x; }

         double result = 1.0;

         if(n < 0){
             x=1/x;
             n=-n;
         }

         while(n!=0){
             result *= x;
             n--;
         }

         return result;

    }

}
