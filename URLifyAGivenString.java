/*
    URLify a given string
    Given a string s, replace all the spaces in the string with '%20'.
    Examples:
      Input: s = "Mr Benedict Cumberbatch"i love programming
      Output: "Mr%20Benedict%20Cumberbatch"
      Explanation: The 2 spaces are replaced by '%20'
      Input: s = "i love programming"
      Output: "i%20love%20programming"
      Explanation: The 2 spaces are replaced by '%20'
*/

class Solution {
    String URLify(String s) {
        return s.replace(" ","%20");
    }
}
