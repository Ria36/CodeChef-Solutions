/* https://www.codechef.com/problems/DIVBYK */
/* Divisible by K */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DivisiblebyK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0){
		int n = sc.nextInt();
		long k = sc.nextInt();
		long[] nums = new long[n];
		for(int i = 0;i<n;i++){
		    nums[i] = sc.nextInt();
		}
		long prod = 1;
		boolean flag = false;
		for(long p : nums){
		    prod *= p;
		    if(prod % k == 0){
		        flag = true;
		        System.out.println("YES");
		        break;
		    }
		    prod %= k;
		}
		
		if(!flag){
		    System.out.println("NO");
		}
		}
	}
}
