package com.leetcode.no0572;

import com.leetcode.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t == null){
            return true;
        }
        if(s == null){
            return false;
        }
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    private boolean isSameTree(TreeNode s,TreeNode t){
        return false;
    }


}
