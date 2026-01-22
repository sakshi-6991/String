/*
  gcdString from hackeearth
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;


class TestClass {
    
	private static BigInteger binaryToDecimal(String binary){
		BigInteger value=BigInteger.ZERO;
		for(int i=0;i<binary.length();i++){
			value=value.multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(binary.charAt(i)-'0'));
		}
		return value;
	}



    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		BigInteger MOD = BigInteger.valueOf(1000000007);
		while(t-->0){
			int a = sc.nextInt();
			int b = sc.nextInt();

			StringBuilder gcdString = new StringBuilder();

			if(a%b==0){
				gcdString.append('1');
				for(int i=1;i<a;i++){
					gcdString.append('0');
				}
			}else{
				StringBuilder pattern = new StringBuilder();
				pattern.append('1');
				for(int i=1;i<b;i++){
					pattern.append('0');
				}
				while(gcdString.length()<a){
					gcdString.append(pattern);
				}
				gcdString.setLength(a);
			}

			BigInteger result = binaryToDecimal(gcdString.toString());
			System.out.println(result);
		}
		sc.close();
       
    }
}
