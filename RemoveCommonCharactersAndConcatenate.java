/*
    Remove common characters and concatenate
    Given two strings, s1 and s2. The task is to remove all characters that are common in both strings and then combine the remaining characters from each string to form a new string. The characters that are not shared between the two strings should appear in the result in the same order as they appear in their respective original strings. If, after removing the common characters, no characters are left to form the result, return "-1"
    Examples:
      Input: s1 = aacdb, s2 = gafd
      Output: cbgf
      Explanation: The common characters of s1 and s2 are: a, d. The uncommon characters of s1 and s2 are c, b, g and f. Thus the modified string with uncommon characters concatenated is cbgf.
      Input: s1 = abcs, s2 = cxzca
      Output: bsxz
      Explanation: The common characters of s1 and s2 are: a,c. The uncommon characters of s1 and s2 are b,s,x and z. Thus the modified string with uncommon characters concatenated is bsxz.
*/

class Solution {
    public static String concatenatedString(String s1, String s2) {
        boolean[] inS1=new boolean[26];
        boolean[] inS2=new boolean[26];
        
        for(char ch:s1.toCharArray()){
            inS1[ch-'a']=true;
        }
        for(char ch:s2.toCharArray()){
            inS2[ch-'a']=true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch:s1.toCharArray()){
            if(!inS2[ch-'a']){
                stringBuilder.append(ch);
            }
        }
        for(char ch:s2.toCharArray()){
            if(!inS1[ch-'a']){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.length()==0?"-1":stringBuilder.toString();
    }
}
