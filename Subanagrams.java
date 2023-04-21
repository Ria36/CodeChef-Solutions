/* https://www.codechef.com/problems/SUBANAGR */
/* Subanagrams */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=t;
		int k=0;
		int f=0;
		int[][] ar=new int[n][26];
		while(t-->0){
		    String s=sc.next();
		    for(int i=0;i<s.length();i++){
		        ar[k][s.charAt(i)-'a']++;
		    }
		    k++;
		}
		for(int j=0;j<26;j++){
		    int c=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    c=Math.min(c,ar[i][j]);
		}
		for(int i=0;i<c;i++){
		    f=1;
		System.out.print((char)(97+j));
		}
		
		}
		if(f==0){
		    System.out.println("no such string");
		}
	}
}
