package com.leetcode.no1807;

import bean.TreeNode;

public class Solution01 {

    public TreeNode mirrorTree(TreeNode root){

        if(root == null){ return null; }

        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);

        return root;

    }

}
