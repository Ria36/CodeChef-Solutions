/* https://www.codechef.com/problems/CAMPON */
/* Camp Or Not */

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
		int t=sc.nextInt();
		while(t-->0)
		{
            int a=sc.nextInt();
            int ar[]=new int[31];

            while(a-->0)
            {int f=sc.nextInt();
             int p=sc.nextInt();
             ar[f-1]=p;}
             
             int b=sc.nextInt();
             while(b-->0)
             
             {
              int c=0;
              int m=sc.nextInt();
              int n=sc.nextInt();
                for(int i=0;i<m;i++)
                {
                    c=c+ar[i];
                }
                if(c>=n)
                System.out.println("Go Camp");
                else
                System.out.println("Go Sleep");
             }    
		}
	}
}
