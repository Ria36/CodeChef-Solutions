/* https://www.codechef.com/START93D/problems/PR0BLEM */
/* Problem */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Initial number of problems for Alice
            int M = scanner.nextInt(); // Initial number of problems for Bob

            // Check if it is possible to have the same number of problems left
            boolean isPossible = isEquilibriumPossible(N, M);

            // Output the result
            if (isPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
	}
	private static boolean isEquilibriumPossible(int N, int M) {
        // If the initial number of problems for Alice and Bob is already the same, return true
        if (N == M) {
            return true;
        }

        // If the difference in the initial number of problems is a multiple of 2, return true
        if ((Math.abs(N - M) % 2) == 0) {
            return true;
        }

        return false;
    }
}
