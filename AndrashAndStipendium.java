/* https://www.codechef.com/problems/EGRANDR */
/* Andrash and Stipendium */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AndrashAndStipendium
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    for (int t=0;t<T;t++)
	    {
	        int n = s.nextInt();
	        int[] a = new int[n];
	        int sum = 0;
	        int b = 0;
	        int b1 = 0;
	        int a1 = 0;
	        for (int i = 0;i<n;i++)
	        {
	            a1 = s.nextInt();
	            if (a1==5)
	            {
	                b=1;
	            }
	            if (a1==2)
	            {
	                b1 = 1;
	            }
	            sum+=a1;
	        }
	        if (b1==0 && b==1 && (sum/n)>=4.0)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	    }
	}
}
