package com.leetcode.no1815;

public class Solution01 {

    public boolean verifyPostorder(int[] postorder){
        return recur(postorder,0,postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j){

        // 说明该节点为叶子节点
        if(i >= j){ return true; }

        // 左子树起点, 遍历左子树与根节点之间的关系
        int p = i;
        while(postorder[p] < postorder[j]){ p++; }

        // 右子树起点,遍历右子树与根节点之间的关系
        int m = p;
        while(postorder[p] > postorder[j]){ p++; }

        // 左右子树都符合规定 && 对左子树验证 && 对右子树验证
        return p ==j && recur(postorder,i,m-1) && recur(postorder,m,j-1);

    }

}
