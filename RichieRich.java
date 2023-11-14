/* https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/CHFRICH */
/* Richie Rich */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RichieRich
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int x=sc.nextInt();
		    System.out.println((b-a)/x);
		}
	}
}
