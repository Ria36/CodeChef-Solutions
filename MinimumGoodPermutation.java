/* https://www.codechef.com/problems/MINPERM */
/* Minimum Good Permutation */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinimumGoodPermutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    if(N%2==0){
		        int start=2;
		        for(int i=0;i<N;i=i+2){
		            System.out.print(start+" ");
		            //start--;
		            System.out.print(start-1+" ");
		            start+=2;
		        }
		        System.out.println();
		    }else{
		        int start=2;
		        int run=N-3;
		        for(int i=0;i<run;i=i+2){
		            System.out.print(start+" ");
		            //start--;
		            System.out.print(start-1+" ");
		            start+=2;
		        }
		        
		        int sL=N-1;
		        int fl=N;
		        int l=N-2;
		        System.out.println(sL+" "+fl+" "+l);
		    }
		}
	}
}
