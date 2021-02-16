package com.leetcode.no0572;

import bean.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class Solution02 {

    private Map<TreeNode,Integer> map = new HashMap<>();

    private String computeHash(TreeNode t){

        if(t == null){  return "#"; }

        String left = computeHash(t.left);
        String right = computeHash(t.right);
        String hash = left + t.val + right;
        map.put(t,hash.hashCode());
        return hash;
    }

    public boolean isSub(TreeNode s,TreeNode t){

        if(t == null){return true;}
        if(s == null){return false;}
        return map.get(s).equals(map.get(t))||isSub(s.left,t)||isSub(s.right,t);

    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        computeHash(s);
        computeHash(t);
        return isSub(s,t);
    }
}
