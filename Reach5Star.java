/* https://www.codechef.com/START128D/problems/R5S  */

/* Reach 5 Star */

import java.util.*;
import java.lang.*;
import java.io.*;

class Reach5Star
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);

        // Input chef's initial rating and the amount by which his rating will increase
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Calculate the new rating
        int newRating = X + Y;

        // Check if the new rating is greater than or equal to 2000
        if (newRating >= 2000) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
	}
}
