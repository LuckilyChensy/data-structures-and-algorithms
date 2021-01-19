package com.leetcode.test;

import org.junit.Test;

public class Case {

    @Test
    public void testMethod01(){

        char[] ch = {'a','A','b','B'};

        for(int i = 0 ; i < ch.length; i++){
            ch[i] = Character.toLowerCase(ch[i]);
        }

        for(int i = 0 ; i < ch.length; i++){
            System.out.print(ch[i]+" ");
        }

    }

}
