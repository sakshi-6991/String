/*
    FIRST OCCURENCE
    Given two strings txt and pat, return the 0-based index of the first occurrence of the substring pat in txt. If pat is not found, return -1.
    Note: You are not allowed to use the inbuilt function.
    Examples :
      Input: txt = "GeeksForGeeks", pat = "Fr"
      Output: -1
      Explanation: "Fr" is not present in the string "GeeksForGeeks" as substring.
      Input: txt = "GeeksForGeeks", pat = "For"
      Output: 5
      Explanation: "For" is present as substring in "GeeksForGeeks" from index 5 (0 based indexing).
      Input: txt = "GeeksForGeeks", pat = "gr"
      Output: -1
      Explanation: "gr" is not present in the string "GeeksForGeeks" as substring.
*/

class Solution {
    int firstOccurence(String txt, String pat) {
        int n=txt.length();
        int m=pat.length();
        if(m>n) return -1;
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
}
