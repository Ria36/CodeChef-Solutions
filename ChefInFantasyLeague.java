/* Chef in Fantasy League */
/* https://www.codechef.com/problems/FFL */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefInFantasyLeague
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			int pr[]=new int[n];
			int f[]=new int[n];
			for(int i=0;i<n;i++)
			{
				pr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				f[i]=sc.nextInt();
			}
			int total=x;
			int flag=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(f[i]==0 && f[j]==1 && pr[i]+pr[j]+total<=100)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
					break;
			}
			if(flag==1)
			{
				System.out.println("yes");
			}
			else
				System.out.println("no");
		}
	}
}
