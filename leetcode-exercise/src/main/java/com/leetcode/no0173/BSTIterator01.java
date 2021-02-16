package com.leetcode.no0173;

import bean.TreeNode;

import java.util.ArrayList;

public class BSTIterator01 {
    // 存放 BST 中序遍历结果
    ArrayList<Integer> nodesSorted;
    // 指向下一个最小值点
    int index;

    public BSTIterator01(TreeNode root){
        this.nodesSorted = new ArrayList<Integer>();
        this.index = -1;
        this.inorder(root);
    }

    private void inorder(TreeNode root){
        if(root == null){
            return ;
        }

        this.inorder(root.left);
        this.nodesSorted.add(root.val);
        this.inorder(root.right);
    }

    public int next(){
        return this.nodesSorted.get(++this.index);
    }

    public boolean hasNext(){
        return this.index + 1 < this.nodesSorted.size();
    }
}
