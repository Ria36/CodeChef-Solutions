/* https://www.codechef.com/problems/MINSM */
/* Minimum Sum */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinimumSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- >0){
		    int n =sc.nextInt();
		    long[] ar =new long[n];
		    int max=0;
		    for(int i=0;i<n;i++){
		        ar[i] = sc.nextInt();
		    }
		    long g =ar[0];
		    for(int i=1;i<n;i++){
		        g=gcd(g,ar[i]);
		    }
		    System.out.println(g*n);
		}
	}
	public static long gcd(long a,long b){
	    if(a%b == 0){
	        return b;
	    }else{
	        return gcd(b,a%b);
	    }
	}
}
