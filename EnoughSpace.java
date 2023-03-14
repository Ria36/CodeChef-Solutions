/* Enough Space */
/* https://www.codechef.com/problems/ENSPACE */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EnoughSpace
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-- >0)
		{
		    int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		    if(b+c*2 <=a)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
	}
}
