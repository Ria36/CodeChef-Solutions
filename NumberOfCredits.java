/* Number Of Credits*/
/* https://www.codechef.com/problems/CREDS */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NumberOfCredits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int result = (4*x)+(2*y)+(0*z);
		    System.out.println(result);
		}
	}
}
