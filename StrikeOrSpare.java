/* https://www.codechef.com/problems/PINS */
/* Strike or Spare */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StrikeOrSpare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int n = sc.nextInt();
		   
		    StringBuilder s = new StringBuilder("1");
		    for(int i=0;i<n/2;i++){
		        s.append("0");
		    }
		    System.out.println(1+ " "+s);
		}
	}
}
