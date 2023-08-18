/* https://www.codechef.com/problems/MAXDIFF */
/* Maximum Weight Difference */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaximumWeightDifference
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0; i<n; i++){
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    int max = Math.max(k,n-k);
		    int i=n-1,dd=0,sn=0;
		    while(max>0){
		        dd+=a[i];
		    
		        i--;
		        max--;
		    }
		    while(i>=0){
		        sn+=a[i];
		    
		        i--;
		    }
		    System.out.println(dd-sn);
		    
		}
	}
}
