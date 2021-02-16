package com.leetcode.no0104;

import bean.TreeNode;

public class Solution01 {
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
}
