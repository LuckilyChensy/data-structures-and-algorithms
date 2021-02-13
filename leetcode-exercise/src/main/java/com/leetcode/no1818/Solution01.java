package com.leetcode.no1818;

import com.leetcode.bean.TreeNode;

public class Solution01 {

    // 主要解决好在改变节点指向后丢失节点的问题
    TreeNode head;
    TreeNode pre;

    public TreeNode treeToDoublyList(TreeNode root){

        if(root == null){
            return null;
        }

        dfs(root);

        pre.right = head;
        head.left = pre;

        return head;

    }

    public void dfs(TreeNode cur){
        if(cur == null) { return ; }
        dfs(cur.left);

        // pre 用于记录双向双向链表中位于 cur 左侧的节点, 即上一次迭代中的 cur, 当 pre == null 时, cur 左侧没有节点, 即此时 cur 为双向链表中的头节点
        if(pre == null){
            head = cur;
        }else {
            pre.right =cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);

    }

}
