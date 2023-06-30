/* https://www.codechef.com/problems/PPATTERN */
/* Print Pattern */

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
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-- >0) {
		    int n=in.nextInt();
		    int a[][]=new int[n][n];
		    int c=0;
		    int k=1;
		    while(k!=(n*n)+1) {
    		    for(int i=0;i<n;i++) {
    		        for(int j=0;j<n;j++) {
    		            if(i+j==c) {
    		                a[i][j]=k;
    		                k++;
    		            }
    		        }
    		    }
		    c++;
		    }
		    for(int i=0;i<n;i++) {
		        for(int j=0;j<n;j++) {
		            System.out.print(a[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
	}
}

