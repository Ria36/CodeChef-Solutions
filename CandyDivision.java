/* codechef.com/problems/CANDIVIDE */
/* Candy Division */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CandyDivision
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    if(n%3 == 0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
