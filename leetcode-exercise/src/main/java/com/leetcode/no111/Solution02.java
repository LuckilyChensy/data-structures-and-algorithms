package com.leetcode.no111;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先搜索
 */
public class Solution02 {

    class QueueNode{

        TreeNode node;
        int depth;

        public QueueNode(TreeNode node,int depth){
            this.node = node;
            this.depth = depth;
        }

    }

    public int minDepth(TreeNode root){

        if(root == null){
            return 0;
        }

        Queue<QueueNode> queue = new LinkedList<QueueNode>();

        queue.offer(new QueueNode(root,1));

        while(!queue.isEmpty()){
            QueueNode nodeDepth = queue.poll();

            TreeNode node = nodeDepth.node;

            int depth = nodeDepth.depth;

            if (node.left == null && node.right == null) {
                return depth;
            }

            if (node.left != null) {
                queue.offer(new QueueNode(node.left, depth + 1));
            }

            if (node.right != null) {
                queue.offer(new QueueNode(node.right, depth + 1));
            }

        }
        return 0;
    }

}
