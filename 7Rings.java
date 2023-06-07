/* https://www.codechef.com/START93D/problems/SEVENRINGS */
/* 7 Rings */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class 7Rings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int result = n*x;
		    int length = String.valueOf(result).length();
		    if(length<5 || length>5)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
	}
}

