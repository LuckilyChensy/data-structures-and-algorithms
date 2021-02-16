package com.leetcode.no0173;

import bean.TreeNode;

import java.util.Stack;

public class BSTIterator03 {

    private final Stack<TreeNode> stack = new  Stack<>();

    private void pushLeft(TreeNode node){
        while(node != null){
            stack.push(node);
            node =node.left;
        }
    }

    public BSTIterator03(TreeNode root){
        pushLeft(root);
    }

    public int next(){
        TreeNode node = stack.pop();
        pushLeft(node.right);
        return node.val;
    }

    public boolean hasNext(){
        return this.stack.size() != 0;
    }

}
