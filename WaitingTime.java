/* Waiting Time */
/* https://www.codechef.com/problems/WAITTIME */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WaitingTime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    int remainingDays = 7*k-x;
		    System.out.println(remainingDays);
		}
	}
}
