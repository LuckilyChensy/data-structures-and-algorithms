package com.leetcode.no0202;

public class Solution02 {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = bitSquareSum(n);

        while(slow!=fast){
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
        }
        return (slow == 1);
    }

    int bitSquareSum(int n) {
        int sum = 0;
        int cur;
        while(n!=0){
            cur = n%10;
            sum+=cur*cur;
            n=n/10;
        }
        return sum;
    }

}
