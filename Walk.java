/* https://www.codechef.com/problems/WALK */
/* Walk */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		
		while(in --> 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int c = 0;
		    
		    for(int i = 0; i < n; i++)
		    {
		       c =  Math.max(c,arr[i]+i);
		    }
		    
		    System.out.println(c);
		}
	}
}
