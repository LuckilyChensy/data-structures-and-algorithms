package com.leetcode.no0144;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution02 {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<TreeNode>();

        stack.push(root);

        while(!stack.isEmpty()){

            TreeNode temp = stack.pop();
            result.add(temp.val);

            if(temp.right != null){
                stack.push(temp.right);
            }

            if(temp.left!=null){
                stack.push(temp.left);
            }

        }
        return result;
    }
}
