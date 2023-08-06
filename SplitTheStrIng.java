/* https://www.codechef.com/problems/SPLITIT */
/* Split the Str Ing */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SplitTheStrIng
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    String s = sc.next();
		    boolean flag = false;
		    for(int i=0;i<n-1;i++)
		    {
		        if(s.charAt(i) == s.charAt(n-1))
		        {
		            flag = true;
		        }
		    }
		    if(flag)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
