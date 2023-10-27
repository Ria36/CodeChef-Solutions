/* https://www.codechef.com/problems/CATFEED */
/* Chef Feeds Cats */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefFeedsCats
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		   int n=sc.nextInt();
		   int m=sc.nextInt();
		   int f=0;
		   HashSet<Integer> h=new HashSet<>();
		   while(m-->0)
		   {
		     int x=sc.nextInt();
		     if(f==0)
		     {
		       if(h.contains(x))
		       {
		         if(h.size()!=n)
		           f=1;
		         else 
		           h.clear();
		       }
		         h.add(x);
		     }
		   }
		    if(f==0)
		    System.out.println("YES");
		   else 
		    System.out.println("NO");
		}
	}
}
