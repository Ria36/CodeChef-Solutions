/* https://www.codechef.com/problems/TWONMS */
/* Two Numbers */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a, b, n, m;
            a = in.nextLong();
            b = in.nextLong();
            n = in.nextLong();
            if (n % 2 == 0) {
                if (a > b) {
                    System.out.printf("%d\n", a / b);
                } else {
                    System.out.printf("%d\n", b / a);
                }
            } else {
                m = a * 2;
                if (m > b) {
                    System.out.printf("%d\n", m / b);
                } else {
                    System.out.printf("%d\n", b / m);
                }
            }
        }
	}
}
