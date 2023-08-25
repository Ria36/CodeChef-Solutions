/* https://www.codechef.com/problems/SALARY */
/* The Minimum Number Of Moves */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheMinimumNumberOfMoves
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		        
		      }
		      Arrays.sort(a);
		      int sum=0;
		      int min=a[0];
		      if(a[0]==a[n-1]){
		          System.out.println(0);
		          
		      }else{
		          for(int i=1;i<n;i++){
		              sum=sum+(a[i]-min);
		          }
		          System.out.println(sum);
		      }
		      
		}
	}
}

