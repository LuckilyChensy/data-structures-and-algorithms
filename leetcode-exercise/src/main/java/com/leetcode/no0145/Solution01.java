package com.leetcode.no0145;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution01 {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();

        if(root == null){ return result; }

        TreeNode cur = root;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        stack.push(root);

        while(!stack.isEmpty()){

            TreeNode peek = stack.peek();

            if(peek.left != null && peek.left != cur && peek.right != cur){
                stack.push(peek.left);
            }else if(peek.right!= null && peek.right != cur){
                stack.push(peek.right);
            }else{
                result.add(stack.pop().val);
                cur = peek;
            }

        }
        return result;
    }

}
