/* Sleep deprivation */
/* https://www.codechef.com/problems/SLEEP */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SleepDeprivation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    if(x<7)
		    System.out.println("YES");
		    else if(x>=7)
		    System.out.println("NO");
		}
	}
}
