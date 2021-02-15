package com.leetcode.no0098;

import com.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    List<Integer> result = new ArrayList<Integer>();

    public boolean isValidBST(TreeNode root) {

        if(root == null) { return true; }
        inOrder(root);

        for(int i = 0; i < result.size()-1; i++){
            if(result.get(i+1) <= result.get(i)){
                return false;
            }
        }

        return true;

    }

    private void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            result.add(root.val);
            inOrder(root.right);
        }
    }

}
