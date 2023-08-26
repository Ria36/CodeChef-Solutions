/* https://www.codechef.com/problems/SUMPERM */
/* Prefix Permutation */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrefixPermutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    if(n%2!=0){
		        System.out.println("-1");
		    }
		    else{
		    int odd = 1;
		    int even = 2;
		    for(int i=1;i<=n;i++){
		       if(i%2==0){
		           System.out.print(odd+" ");
		           odd+=2;
		       }
		       else{
		           System.out.print(even+" ");
		           even+=2;
		       }
		    }
		    System.out.println("");
		    }
		}
	}
}
