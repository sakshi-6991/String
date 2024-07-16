/*

Display longest name
Given a list of names, display the longest name. If there are multiple names of the longest size then return the first occurring name.

*/

package String;

public class LongestString {
    public static String longest(int n,String[] names){
        if(names == null || n==0){
            return null;
        }
        String longestStringName = names[0];
        for(int i=0;i<n;i++){
            if(names[i].length()>longestStringName.length()){
                longestStringName = names[i];
            }
        }
        return longestStringName;
    }
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "CPP", "SQL"};
        System.out.println(longest(5, names));
    }
}
