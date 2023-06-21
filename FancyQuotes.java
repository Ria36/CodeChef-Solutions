/* https://www.codechef.com/problems/FANCY */
/* Fancy Quotes */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FancyQuotes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    String s=sc.nextLine();
		    s=" "+s+" ";
		    if(s.contains(" not "))
		    {
		        System.out.println("Real Fancy");

		    }
		    else
		    System.out.println("regularly fancy");
		}
	}
}

