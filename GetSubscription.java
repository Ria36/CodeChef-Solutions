/* https://www.codechef.com/problems/SUBSCRIBE */
/* Get Subscription */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GetSubscription
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            if (x <= 30) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
	}
}
