/* https://www.codechef.com/problems/DETSCORE */
/* Determine the Score */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DetermineTheScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int n = sc.nextInt();
		    int testCases = x/10;
		    int score = testCases*n;
		    System.out.println(score);
		}
	}
}
