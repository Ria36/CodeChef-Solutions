/* https://www.codechef.com/problems/SPCANDY */
/* Splitting Candies */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SplittingCandies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    long N=sc.nextLong();
		    long K=sc.nextLong();
		    if(K==0) 
		    System.out.println(0+" "+N);
		    else if(N%K==0){
		        System.out.println(N/K +" "+0);
		    }else{
		        long candies=N/K;
		        long left=N-(candies*K);
		        System.out.println(candies+" "+left);
		    }
		}
	}
}
