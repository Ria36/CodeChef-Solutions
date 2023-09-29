/* https://www.codechef.com/problems/ADASTAIR */
/* Ada and the Staircase */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;

/* Name of the class has to be "Main" only if the class is public. */
class AdaAndTheStaircase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] h = new int[N];
			for (int i = 0; i < h.length; i++) {
				h[i] = sc.nextInt();
			}
			System.out.println(solve(h, K));
		}
		sc.close();
	}
	static int solve(int[] h, int K) {
		return IntStream.range(0, h.length).map(i -> computeIntermediateSteps(K, h[i] - (i == 0 ? 0 : h[i - 1]))).sum();
	}
	static int computeIntermediateSteps(int K, int delta) {
		return Math.max(0, divideToCeil(delta, K) - 1);
	}
	static int divideToCeil(int x, int y) {
		return x / y + (x % y == 0 ? 0 : 1);
	}
}
