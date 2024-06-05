/* https://www.codechef.com/practice/course/2-star-difficulty-problems/DIFF1500/problems/CHDOGS?tab=statement */
/* Chef and Three Dogs */

import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndThreeDogs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long s = sc.nextLong(), v = sc.nextLong();
            System.out.println((2.0*s)/(3.0*v));
        }
        sc.close();
	}
}
