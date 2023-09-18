/* https://www.codechef.com/problems/NUMGAME2 */
/* Number Game Revisited */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NumberGameRevisited
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		   if(n%4==1)
		System.out.println("ALICE");
		else
		System.out.println("BOB");
		}
	}
}
