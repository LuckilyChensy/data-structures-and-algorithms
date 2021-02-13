package com.leetcode.no1816;

import com.leetcode.bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution01 {

    LinkedList<List<Integer>> result  = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum){
        recur(root,sum);
        return result;
    }

    public void recur(TreeNode root,int target){
        if(root == null){ return;}

        path.add(root.val);
        target -= root.val;

        if(target == 0 && root.left == null && root.right == null){
            result.add(path);
        }

        recur(root.left,target);
        recur(root.right,target);
        path.removeLast();
    }

}
