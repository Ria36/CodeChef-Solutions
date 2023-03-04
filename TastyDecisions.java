/* https://www.codechef.com/problems/TASTEDEC */
/* Tasty Decisions */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TastyDecisions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int chocolate = 2 * a;
		    int candy = 5 * b;
		    
		    if(chocolate<candy)
		    System.out.println("Candy");
		    else if(chocolate==candy)
		    System.out.println("Either");
		    else
		    System.out.println("Chocolate");
		}
	}
}
