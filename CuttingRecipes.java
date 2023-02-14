/* https://www.codechef.com/problems/RECIPE */
/* Cutting Recipes */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CuttingRecipes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int[] k = new int[t];
            for (int j = 0; j < t; j++) {
                k[j] = sc.nextInt();
            }

            int gcd = k[0];
            for (int j = 1; j < t; j++) {
                gcd = findGcd(gcd, k[j]);
            }

            for (int j = 0; j < t; j++) {
                System.out.print(k[j] / gcd + " ");
            }
            System.out.println();
        }
    }

    private static int findGcd(int a, int b) {
        if (a < b) {
            return findGcd(b, a);
        }
        if (b == 1) {
            return 1;
        }
        if (b == 0) {
            return a;
        }

        return findGcd(a % b, b);
	}
}
