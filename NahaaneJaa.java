/* https://www.codechef.com/problems/EQSARRAY */
/* Nahaane Jaa */

/* package codechef; // don't place package name! */

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
		int test= sc.nextInt();
		while(test-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int a[]=new int[n];
		    int bool=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        if(a[i]==k && i!=n-1){
		            bool=1;
		        } 
		    }
		    if(n==1 && k==a[0]){
		        System.out.println("Yes");
		        continue;
		        
		    }
		    if(bool!=1) System.out.println("No");
		    else System.out.println("Yes");
		}
	}
}
