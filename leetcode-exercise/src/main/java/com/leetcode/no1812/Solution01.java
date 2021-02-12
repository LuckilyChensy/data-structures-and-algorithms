package com.leetcode.no1812;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution01 {

    public int[] levelOrder(TreeNode root){

        if(root == null) { return new int[0]; }

        // 队列缓冲层次遍历
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        ArrayList<Integer> temp = new ArrayList<Integer>();

        while(!queue.isEmpty()){

            TreeNode node = queue.poll();
            temp.add(node.val);

            if(node.left!=null) { queue.add(node.left);  }
            if(node.right!=null){ queue.add(node.right); }

        }

        int[] result = new int[temp.size()];

        for(int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }

        return result;

    }

}
