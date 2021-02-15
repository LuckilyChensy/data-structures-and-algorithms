package com.leetcode.no0145;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null){ return result; }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);

        return result;

    }

}
