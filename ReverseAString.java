/*
      REVERSE A STRING
      You are given a string s, and your task is to reverse the string.
      Examples:
        Input: s = "Geeks"
        Output: "skeeG"
        Input: s = "for"
        Output: "rof"
        Input: s = "a"
        Output: "a"
*/

class Solution {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
