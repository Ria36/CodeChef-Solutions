/* https://www.codechef.com/problems/SPLITMAX */
/* Split and Maximize */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SplitAndMaximize
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    
		    long sum=0;
		    for(int i=0;i<N;i++){
		        sum+=sc.nextInt();
		        sum%=998244353;
		    }
		    
		    long ans=sum*(sum-1) % 998244353;
		    System.out.println(ans);
		}
	}
}
