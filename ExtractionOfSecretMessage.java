/*
      Extraction of secret message
      You are given an encoded string S of length N. The encoded string is mixed with some number of substring "LIE" and some secret message. You have to extract secret message from it by removing all the "LIE" substrings.
      For example - "I AM COOL" is given as "LIEILIEAMLIELIECOOL".
    
      Example 1:
        Input: S = "LIEILIEAMLIELIECOOL"
        Output: "I AM COOL"
      Example 2:
        Input: S = "LIELIEALIEBCLIE"
        Output: "A BC"
      Your Task:  
      You don't need to read input or print anything. Your task is to complete the function ExtractMessage() which accepts a string as input parameter and returns a string containing secret message.
*/

import java.util.*;
class Solution {
    String ExtractMessage(String S) {
        StringBuilder secretMessage=new StringBuilder();
        int i=0;
        while(i<S.length()){
            if(i+2<S.length() && S.substring(i,i+3).equals("LIE")){
                if(!secretMessage.isEmpty() && secretMessage.charAt(secretMessage.length()-1)!=' '){
                    secretMessage.append(" ");
                }    
                i+=3;
            }else{
                secretMessage.append(S.charAt(i));
                i++;
            }
        }
        return secretMessage.toString();
    }
}
