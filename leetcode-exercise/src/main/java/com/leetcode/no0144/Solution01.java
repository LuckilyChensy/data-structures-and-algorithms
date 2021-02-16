package com.leetcode.no0144;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return result;
        }

        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return result;
    }

}
