/* https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/IMDB */

/* Motivation */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Motivation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x,y;
		    x=sc.nextInt();
		    y=sc.nextInt();
		    int max=0;
		    for(int j=0;j<x;j++)
		    {
		        int x1,y1;
		        x1=sc.nextInt();
		        y1=sc.nextInt();
		        if(x1<=y && y1>max)
		        {
		            max=y1;
		        }
		    }
		    System.out.println(max);
		}
		sc.close(); 
	}
}
