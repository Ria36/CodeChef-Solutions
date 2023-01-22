/* Max minus Min */
/* https://www.codechef.com/problems/MAXDIFFMIN */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaxMinusMin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int max = Math.max(a, Math.max(b, c));
		    int min = Math.min(Math.min(a, b), c);
		    int difference = max-min;
		    System.out.println(difference);
		}
	}
}
