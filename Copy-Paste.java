/* https://www.codechef.com/problems/RRCOPY */
/* Copy-Paste */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	
		// your code goes here
		static Scanner sc=new Scanner(System.in);
     public static void code() {
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=1;
        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<n;i++)
       {
           hs.add(arr[i]);
       }
       System.out.println(hs.size());
          
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int t=sc.nextInt();
		while(t-->0)
		{
		    code();
		}
	}
}

