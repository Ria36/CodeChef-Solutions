/* https://www.codechef.com/practice/course/java/PJA03/problems/CBSPEED?tab=statement */
/* Chef and Brain Speed */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndBrainSpeed
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int thresholdLimit = sc.nextInt();
		int currentSpeed = sc.nextInt();
		if(currentSpeed<=thresholdLimit) 
		{
			System.out.println("NO"); 
		}else 
		{
			System.out.println("Yes");
		}
	}
}
