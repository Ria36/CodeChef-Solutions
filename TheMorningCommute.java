/* https://www.codechef.com/problems/COMMUTE */
/* The Morning Commute */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheMorningCommute
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int iter = 0 ; 
		if(sc.hasNextInt())
		    iter = sc.nextInt();
		while (iter-- > 0)
		{
		    int n = sc.nextInt();
		    int start = 0;
		    int total = 0;
		    for(int i = 0 ; i < n ; i++)
		    {
		        int x = sc.nextInt();
		        int l = sc.nextInt();
		        int f = sc.nextInt();
		        while(x < start)
		            x+=f;
		        total+= (l + x - start);
		        start=x + l;
		    }
		    System.out.println(total);
		}
	}
}

