/* https://www.codechef.com/problems/PLMU */
/* Plus Multiply */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PlusMultiply
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0){
	       int n=sc.nextInt();
	       long []arr=new long[n];
	       for(int i=0;i<n;i++){
	           arr[i]=sc.nextLong();
	       }
	       int c=0;
	       int c1=0;
	       for(int i=0;i<n;i++){
              if(arr[i]==2){
                  c++;
              }
              if(arr[i]==0)
               c1++;
	       }
	       long p=c*(c-1)/2;
	       long q=c1*(c1-1)/2;
	       System.out.println(p+q);
	   }
	}
}

