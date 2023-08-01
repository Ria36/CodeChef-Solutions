/* https://www.codechef.com/problems/ATTIC */
/* Attic Crossing */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AtticCrossing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String P = sc.next();
			System.out.println(solve(P));
		}
		sc.close();
	}
	static int solve(String P) {
		int result = 0;
		int jump = 1;
		int prevIndex = 0;
		for (int i = 0; i < P.length(); i++) {
			if (P.charAt(i) == '#') {
				int distance = i - prevIndex;
				if (distance > jump) {
					jump = distance;
					result++;
				}
				prevIndex = i;
			}
		}
		return result;
	}
}
