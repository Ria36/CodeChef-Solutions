/* https://www.codechef.com/problems/CACHEHIT */
/* Cache Hits */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CacheHits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    int b=s.nextInt();
		    int m=s.nextInt();
		    int arr[]=new int[m];
		    for(int i=0;i<m;i++){
		        arr[i]=s.nextInt();
		    }
		    int ans=1;
		    for(int i=0;i<m-1;i++){
		        if(arr[i]/b!=arr[i+1]/b){
		            ans=ans+1;
		        }
		    }
		    System.out.println(ans);
		}
	}
}
