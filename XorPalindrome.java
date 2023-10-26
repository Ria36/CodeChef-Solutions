/* https://www.codechef.com/problems/XORPAL */
/* Xor Palindrome */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class XorPalindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner S = new Scanner(System.in);
		int H = S.nextInt();
		while(H-->0){
		    int len=S.nextInt();
		    String str=S.next();
		    String ans="yes";
		    int n0=0,n1=0;
		    for(int i=0;i<len;i++){
		        char ch = str.charAt(i);
		        if(ch=='0')
		            n0++;
		        else
		            n1++;
		    }
		    if((n0%2!=0)&&(n1%2!=0)&&(n0!=n1))
		        ans = "no";
		    System.out.println(ans);
		}
	}
}
