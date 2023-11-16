/* Hoop Jump */
/* https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/HOOPS */

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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    if(n==1){
		        System.out.println(1);
		    }
		    else{
		         if (n%2==0)
		      System.out.println((n/2)+1);
		      else System.out.println((n+1)/2);
		    }
		}
	}
}
