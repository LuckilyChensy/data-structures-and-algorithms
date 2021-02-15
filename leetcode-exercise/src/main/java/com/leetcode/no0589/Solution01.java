package com.leetcode.no0589;

import com.leetcode.bean.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution01 {

    public List<Integer> preOrder(Node root){

        List<Integer> result = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();

        if(root == null){
            return result;
        }

        stack.push(root);

        while(!stack.isEmpty()){

            Node temp = stack.pop();
            result.add(temp.val);

            for(int i = temp.children.size(); i >0; i--){
                stack.push(root.children.get(i));
            }

        }

        return result;
    }
}
