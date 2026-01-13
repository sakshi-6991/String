/*
    Uncommon characters
    You are given two strings s1 and s2. Your task is to identify the characters that appear in either string but not in both (i.e., characters that are unique to one of the strings). Return the result as a sorted string.

    Examples:
      Input: s1 = "geeksforgeeks", s2 = "geeksquiz"
      Output: "fioqruz"
      Explanation: The characters 'f', 'i', 'o', 'q', 'r', 'u', and 'z' are present in either s1 or s2, but not in both.
      Input: s1 = "characters", s2 = "alphabets"
      Output: "bclpr"
      Explanation: The characters 'b', 'c', 'l', 'p', and 'r' are present in either s1 or s2, but not in both.
      Input: s1 = "rome", s2 = "more"
      Output: ""
      Explanation: Both strings contain the same characters, so there are no unique characters. The output is an empty string.
*/


class Solution {
    String uncommonChars(String s1, String s2) {
        int[] freq = new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            freq[ch-'a']--;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                result.append((char) (i+'a'));
            }
        }
        return result.length()==0?"-1":result.toString();
    }
}
