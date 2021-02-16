package com.leetcode.no1813;

import bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution01 {

    public List<List<Integer>> levelOrder(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if(root != null){ queue.add(root); }

        while(!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left!= null){ queue.add(node.left);}
                if(node.right != null){ queue.add(node.right);}
            }
            result.add(tmp);
        }

        return result;

    }
}
