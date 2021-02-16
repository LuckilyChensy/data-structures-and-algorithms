package com.leetcode.no0101;

import bean.TreeNode;

public class Solution03 {

    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }

        return dfs(root.left,root.right);
    }

    private boolean dfs(TreeNode left,TreeNode right){

        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null || (left.val != right.val)){
            return false;
        }

        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
