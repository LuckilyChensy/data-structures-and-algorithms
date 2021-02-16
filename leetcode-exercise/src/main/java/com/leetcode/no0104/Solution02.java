package com.leetcode.no0104;


import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution02 {

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size; i++){
                TreeNode s = q.poll();
                if(s.left != null){q.add(s.left);}
                if(s.right != null){q.add(s.right);}
            }
            ++depth;
        }

        return depth;

    }

}
