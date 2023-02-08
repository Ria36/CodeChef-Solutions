/* Slow Solution */

/* https://www.codechef.com/problems/SLOWSOLN */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SlowSolution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int maxT = sc.nextInt();
		    int maxN = sc.nextInt();
		    int sumN = sc.nextInt();
		    long res = 0;
		    for(int i=maxN;i>=1;i--){
		        long count = (sumN/i)+(sumN % i > 0 ? 1 : 0);
		        if(count<=maxT){
		            long result = (sumN/i) * ((int)(Math.pow(i,2)))+((int)(Math.pow(sumN % i,2)));
		            res = (res > result ? res : result);
		        }
		        else{
		            res = (res>(maxT*i*i) ? res : maxT*i*i);
		        }
		    }
		    System.out.println(res);
		}
	}
}
