/* Weight Balance */

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
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int m = sc.nextInt();
		    int chefWeight = w2-w1;
		    int a = x1*m;
		    int b = x2*m;
		    if((a<=chefWeight) && (chefWeight<=b))
		    System.out.println("1");
		    else
		    System.out.println("0");
		}
	}
}
