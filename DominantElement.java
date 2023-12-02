/* https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DOMINANT2?tab=Submissions */
/* Dominant Element */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DominantElement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    for(int i=0;i<t;i++) {
	        int maxcount=0;
	        int n=in.nextInt();
	        int[] a=new int[n];
	        for(int j=0;j<n;j++) {
	            a[j]=in.nextInt();
	        }
	        int[] d=new int[1001];
	        for(int j=0;j<n;j++) {
	            d[a[j]]++;
	        }
	        Arrays.sort(d);
	        if(d[1000]==d[999])
	        System.out.println("no");
	        else
	        System.out.println("yes");
	    }
	}
}
