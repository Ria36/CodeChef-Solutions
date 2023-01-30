/* Maximize the Minimum */
/* https://www.codechef.com/LP1TO205/problems/MAXTHEMIN */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaximizeTheMinimum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    Arrays.sort(a);
		    if(k >= n-1)
		    System.out.println(a[n-1]);
		    else
		    System.out.println(a[k]);
		}
	}
}
