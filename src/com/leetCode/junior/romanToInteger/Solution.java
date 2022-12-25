package com.leetCode.junior.romanToInteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int number = 0;
        //Created Map
        Map<Character, Integer> numbers = new HashMap<>();
        //add elements to Map
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        //loop iterates over the roman numeral
        for (int i = 0; i < s.length(); i++) {
            //getting each character of roman numeral and adding it to the variable number
            number = number + (numbers.get(s.charAt(i)));
        }
        return number;
    }
    //Test
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println("test.romanToInt(\"III\") = " + test.romanToInt("III"));
        System.out.println("test.romanToInt(\"MCDIIV\") = " + test.romanToInt("MCDIIV"));
    }
}