/* https://www.codechef.com/problems/NEWPIECE */
/* New Piece */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    if(a==p && b==q)
		    {
		        System.out.println("0");
		    }
		    else if(((a+b)%2==0&&(p+q)%2==0)||((a+b)%2==1&&(p+q)%2==1))
		    {
		        System.out.println("2");
		    }
		    else{
		        System.out.println("1");
		    }
		}
	}
}

