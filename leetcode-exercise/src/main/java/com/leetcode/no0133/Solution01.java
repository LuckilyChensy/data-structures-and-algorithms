package com.leetcode.no0133;

import bean.GraphNode;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    private Map<GraphNode,GraphNode> map = new HashMap<>();

    public GraphNode cloneGraph(GraphNode node) {
        if(node == null){
            return null;
        }

        GraphNode copy = new GraphNode(node.val);
        map.put(node,copy);
        for(GraphNode n:copy.neighbors){
            if(map.containsKey(n)) {
                copy.neighbors.add(map.get(n));
            }else{
                copy.neighbors.add(cloneGraph(n));
            }
        }
        return copy;
    }

}
