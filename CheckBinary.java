/*

Check for Binary
Given a non-empty sequence of characters str, return true if sequence is Binary, else return false

*/

package String;


public class CheckBinary {
    public static boolean isBinary(String str){
        for(char ch : str.toCharArray()){
            if(ch != '0' && ch != '1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        if(isBinary("101001011110")){
            System.out.println("String is Binary");
        }else{
            System.out.println("String is not Binary");
        }

    }
}

