package com.leetCode.junior.palindromNumber;

class Solution {
    public boolean isPalindrome(int x) {
        //store the number to originalNumber
        int reversNumber = 0;
        int remainder;
        int originalNumber;
        if (x >= 0){
            originalNumber = x;
        }else return false;
        //get the revers of originalNumber
        while (x != 0) {
            remainder = x % 10;
            reversNumber = reversNumber * 10 + remainder;
            x /= 10;
        }
        //check if reversNumber equals originalNumber
        //return true else false
        return originalNumber == reversNumber;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.isPalindrome(10) = " + solution.isPalindrome(10));
        System.out.println("solution.isPalindrome(121) = " + solution.isPalindrome(121));
    }
}
