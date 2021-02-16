package com.leetcode.no1808;

import bean.TreeNode;

public class Solution01 {

    public boolean isSymmetric(TreeNode root){
        return root==null?true:recur(root.left,root.right);
    }

    boolean recur(TreeNode L,TreeNode R){
        if(L == null && R == null){ return true; }
        if(L == null || R == null){ return false; }
        return (L.val == R.val)&&recur(L.left,R.right)&&recur(L.right,R.left);
    }

}
