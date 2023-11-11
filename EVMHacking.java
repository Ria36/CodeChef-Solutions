/* https://www.codechef.com/problems/EVMHACK */
/* EVM Hacking */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EVMHacking
{
    public static void solve(Scanner scan) {
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int P = scan.nextInt();
		int Q = scan.nextInt();
		int R = scan.nextInt();

		double moreThanHalf = (P + Q + R) / 2.0;

		if ((A + B + C) > moreThanHalf) {
			System.out.println("YES");
		} else if ((P + B + C) > moreThanHalf) {
			System.out.println("YES");
		} else if ((A + Q + C) > moreThanHalf) {
			System.out.println("YES");
		} else if ((A + B + R) > moreThanHalf) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while (T-- > 0) {
			solve(scan);
		}
		scan.close();
	}
}
