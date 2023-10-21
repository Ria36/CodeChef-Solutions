/* https://www.codechef.com/problems/EOEO */
/* The Tom and Jerry Game! */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TheTomAndJerryGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong();
		   while(n%2==0)
		   n/=2;
		    if(n==1)
		    System.out.println("0");
		    else
		    System.out.println(n/2);
		}
	}
}
