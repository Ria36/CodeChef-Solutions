/* https://www.codechef.com/problems/CHEFGR */
/* Chef and Ground */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndGround
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner (System.in);
		int t =sc.nextInt();
		for (int q = 0 ; q<t ; q++)
		{
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int[] arr = new int[n];
		    int sum = 0;
		    for (int i = 0 ; i<n ;i++)
		    {
		        arr[i] = sc.nextInt();
		        sum  = sum + arr[i];
		    }
		    if ((sum+m)%n==0)
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    
		}
	}
}

