package com.leetcode.no1819;

import bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution01 {

    public String serialize(TreeNode root){

        if(root == null){ return "[]"; }

        StringBuilder result = new StringBuilder();

        // queue 用于迭代序列化
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){

            TreeNode node = queue.poll();

            if(node!=null){
                result.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            }else{
                result.append("null,");
            }
        }

        result.deleteCharAt(result.length() - 1);
        result.append("]");
        return result.toString();
    }

    public TreeNode deserialize(String data){

        if(data.equals("[]")){ return null; }

        String[] vals = data.substring(1,data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while(!queue.isEmpty()){

            TreeNode node = queue.poll();

            if(!vals[i].equals("null")){
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if(!vals[i].equals("null")){
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}
