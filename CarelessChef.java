/* https://www.codechef.com/problems/LOSTSEQ */
/* Careless Chef */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CarelessChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int n=0;n<T;n++)
		{
		    int N=sc.nextInt();
		    int arr[]=new int[2*N];
		     int count=0;
		    for(int i=0;i<2*N;i++)
		    {
		    arr[i]=sc.nextInt();
		    if(arr[i]<0)
		    arr[i]=Math.abs(arr[i]);
		    if(arr[i]%2==1)
		    count++;
		    }
		    if(count%2==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
