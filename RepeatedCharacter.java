/*
    Repeated Character
    Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.
    NOTE - If there are no repeating characters return '#'.

    Example 1:
      Input:
      S = "geeksforgeeks"
      Output: g
      Explanation: g, e, k and s are the repeating
      characters. Out of these, g occurs first. 
    Example 2:
      Input: 
      S = "abcde"
      Output: -1
      Explanation: No repeating character present. (You need to return '#')
*/


class Solution {
    char firstRep(String S) {
        int[] freq = new int[26];
        for(char ch : S.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder stringbuilder=new StringBuilder();
        for(char ch:S.toCharArray()){
            if(freq[ch-'a']>1){
                return ch;
            }
        }
        return '#';
    }
}
