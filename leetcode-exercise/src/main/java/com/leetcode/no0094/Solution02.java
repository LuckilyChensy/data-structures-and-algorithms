package com.leetcode.no0094;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution02 {

    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> result = new ArrayList<Integer>();

        if(root == null){ return result; }

        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(!stack.isEmpty() || cur!=null){

            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode temp = stack.pop();

            result.add(temp.val);

            if(temp.right!=null){
                cur = temp.right;
            }

        }

        return result;

    }
}
