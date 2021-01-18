package com.leetcode.no0079;

public class Solution01 {

    public boolean exist(char[][] board, String word) {

        if(board == null || board.length == 0 || board[0] == null || board[0].length == 0){
            return false;
        }

        int m = board.length,n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(exist(board,visited,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exist(char[][] board,boolean[][] visited,int i,int j,String word,int idx){

        if(idx == word.length()){
            return true;
        }

        if( i < 0 || i >= board.length || j < 0 || j >=board[0].length ||visited[i][j] || board[i][j] != word.charAt(idx)){
            return false;
        }

        visited[i][j] = true;

        boolean existed = exist(board,visited,i-1,j,word,idx+1)||
                exist(board,visited,i+1,j,word,idx+1)||
                exist(board,visited,i,j-1,word,idx+1)||
                exist(board,visited,i,j+1,word,idx+1);

        return existed;
    }

}
