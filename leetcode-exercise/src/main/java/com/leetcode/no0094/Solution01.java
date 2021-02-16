package com.leetcode.no0094;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root){

        // 处理边界情况
        if(root == null ){ return result; }

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);

        return result;

    }
}
