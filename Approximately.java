/* https://www.codechef.com/problems/APPROX */
/* Approximately */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Approximately
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int num=103993;
		    int den=33102;
		    
		     StringBuilder ans = new StringBuilder();
		   
		    for(int i=0;i<=N;i++){
		        if(i==1) ans.append(".");
		        ans.append(num/den);
		        num = num%den*10;
		    }
		    System.out.println(ans);
		}
	}
}

