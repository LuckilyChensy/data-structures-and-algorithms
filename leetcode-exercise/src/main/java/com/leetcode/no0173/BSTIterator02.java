package com.leetcode.no0173;

import bean.TreeNode;

import java.util.Stack;

public class BSTIterator02 {

    Stack<TreeNode> stack;

    public BSTIterator02(TreeNode root){
        this.stack = new Stack<TreeNode>();
        this.leftmostInorder(root);
    }

    private void leftmostInorder(TreeNode root){
        while(root!=null){
            this.stack.push(root);
            root = root.left;
        }
    }

    public int next(){
        TreeNode topmostNode = this.stack.pop();
        if(topmostNode.right != null){
            this.leftmostInorder(topmostNode.right);
        }
        return topmostNode.val;
    }

    public boolean hasNext(){
        return this.stack.size() > 0;
    }

}
