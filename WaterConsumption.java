/* https://www.codechef.com/practice/course/java/PJA05/problems/WATERCONS?tab=statement */
/* Water Consumption */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int x=sc.nextInt();
		    if(x>=2000)
		    {
		        System.out.println("YES");
		    }
		    else if(x<2000)
		    {
		        System.out.println("NO");
		    }
		}
	}
}
