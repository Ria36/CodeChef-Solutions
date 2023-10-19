/* https://www.codechef.com/problems/MAKE_AB_SAME */
/* Make A-B Same */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int a = 0, b = 0;
        int[] arr = new int[n];
        int[] brr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            brr[i] = scanner.nextInt();
        }

        if (arr[0] != brr[0] || arr[n - 1] != brr[n - 1]) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                a++;
            } else {
                b++;
            }
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != brr[i] && arr[i] == 0 && b == 0) {
                System.out.println("NO");
                return;
            }
            if (arr[i] != brr[i] && arr[i] == 1) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            solve(scanner);
        }

        scanner.close();
	}
}
