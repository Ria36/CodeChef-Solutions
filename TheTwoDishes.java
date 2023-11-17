/* https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/MAX_DIFF */
/* The Two Dishes */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheTwoDishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		
		int testCases = s.nextInt();
		
		while(testCases>0){
		    
		    int n= s.nextInt();
		    int m = s.nextInt();
		    
		    System.out.println(n-Math.abs(m-n));
		    testCases--;
	}
}
}
